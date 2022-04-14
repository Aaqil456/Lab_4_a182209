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
        allLaptop.add(new Laptop("Asus",R.drawable.asus,"This is Asus. By the way Dr Lam handsome"));
        allLaptop.add(new Laptop("Apple",R.drawable.apple,"This is Apple. By the way Dr Lam handsome"));
        allLaptop.add(new Laptop("Dell",R.drawable.dell,"This is Dell. By the way Dr Lam handsome"));
        allLaptop.add(new Laptop("Lenovo", R.drawable.lenovo,"This is Lenovo. By the way Dr Lam handsome"));
        allLaptop.add(new Laptop("HP",R.drawable.hp,"This is HP. By the way Dr Lam handsome"));
        allLaptop.add(new Laptop("Realme",R.drawable.realme,"This is Realme. By the way Dr Lam handsome"));



        return allLaptop;
    }
}