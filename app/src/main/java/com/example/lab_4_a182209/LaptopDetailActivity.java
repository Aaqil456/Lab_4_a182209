package com.example.lab_4_a182209;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LaptopDetailActivity extends AppCompatActivity {
    TextView tvBrandDetail,tvBrandDescription;
    ImageView ivBrand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_detail);

        Intent intent = getIntent();

        tvBrandDetail=findViewById(R.id.tv_laptop_brand_detail);
        ivBrand=findViewById(R.id.img_laptop_detail);
        tvBrandDescription=findViewById(R.id.tv_description);

        tvBrandDetail.setText(intent.getStringExtra("laptopBrand"));
        ivBrand.setImageResource(intent.getIntExtra("laptopImage",0));
        tvBrandDescription.setText(intent.getStringExtra("laptopDescription"));
    }
}