package com.example.lab_4_a182209;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab_4_a182209.adapter.LaptopRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Laptop> allLaptopInfo=getAllLaptopInfo();
        LaptopRecyclerViewAdapter beverageRecyclerViewAdapter = new LaptopRecyclerViewAdapter(MainActivity.this, allLaptopInfo);
        recyclerView.setAdapter(beverageRecyclerViewAdapter);
    }

    private List<Laptop> getAllLaptopInfo() {
        List<Laptop>allLaptop = new ArrayList<Laptop>();
        allLaptop.add(new Laptop("Asus",R.drawable.asus));
        allLaptop.add(new Laptop("Apple",R.drawable.apple));
        allLaptop.add(new Laptop("Dell",R.drawable.dell));
        allLaptop.add(new Laptop("Lenovo", R.drawable.lenovo));
        allLaptop.add(new Laptop("HP",R.drawable.hp));
        allLaptop.add(new Laptop("Realme",R.drawable.realme));



        return allLaptop;
    }
}