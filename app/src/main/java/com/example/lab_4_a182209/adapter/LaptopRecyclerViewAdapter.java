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
        holder.tvLaptopBrand.setText(laptopList.get(position).getName());
        holder.imgViewLaptopImage.setImageResource(laptopList.get(position).getImage());
        holder.tvLaptopDescription.setText(laptopList.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return laptopList.size();
    }



    public class LaptopViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tvLaptopBrand,tvLaptopDescription;
        public ImageView imgViewLaptopImage;

        public LaptopViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLaptopBrand=itemView.findViewById(R.id.tv_laptop_name);
            imgViewLaptopImage=itemView.findViewById(R.id.img_laptop);
            tvLaptopDescription=itemView.findViewById(R.id.tv_laptop_description);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Laptop Brand "+ laptopList.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(v.getContext(), LaptopDetailActivity.class);
            intent.putExtra("laptopBrand",laptopList.get(getAdapterPosition()).getName());
            intent.putExtra("laptopImage",laptopList.get(getAdapterPosition()).getImage());
            intent.putExtra("laptopDescription",laptopList.get(getAdapterPosition()).getDescription());

            v.getContext().startActivity(intent);
        }
    }
}