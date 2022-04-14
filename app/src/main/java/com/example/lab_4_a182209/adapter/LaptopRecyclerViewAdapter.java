package com.example.lab_4_a182209.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_4_a182209.Laptop;
import com.example.lab_4_a182209.LaptopDetailActivity;
import com.example.lab_4_a182209.R;

import java.util.List;

public class LaptopRecyclerViewAdapter extends  RecyclerView.Adapter<LaptopRecyclerViewAdapter.LaptopViewHolder> {
    public List<Laptop> laptopList;
    private Context context;

    public LaptopRecyclerViewAdapter(Context context, List<Laptop> laptopList) {
        this.context=context;
        this.laptopList=laptopList;
    }
    @NonNull
    @Override
    public LaptopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View laptop_row=  LayoutInflater.from(parent.getContext()).inflate(R.layout.laptop_row,null);
        LaptopViewHolder laptopViewHolder = new LaptopViewHolder(laptop_row);
        return laptopViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewHolder holder, int position) {
        holder.tvBeverageName.setText(laptopList.get(position).getName());
        holder.imgViewBeverageImage.setImageResource(laptopList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return laptopList.size();
    }



    public class LaptopViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tvBeverageName;
        public ImageView imgViewBeverageImage;
        public LaptopViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBeverageName=itemView.findViewById(R.id.tv_laptop_name);
            imgViewBeverageImage=itemView.findViewById(R.id.img_laptop);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Laptop Name "+ laptopList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(v.getContext(), LaptopDetailActivity.class);
            intent.putExtra("laptopName",laptopList.get(getAdapterPosition()).getName());
            v.getContext().startActivity(intent);
        }
    }
}