package com.example.lab_4_a182209;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LaptopDetailActivity extends AppCompatActivity {
    TextView tvNameDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_detail);

        Intent intent = getIntent();

        tvNameDetail=findViewById(R.id.tv_laptop_name_detail);
        tvNameDetail.setText(intent.getStringExtra("laptopName"));
    }
}