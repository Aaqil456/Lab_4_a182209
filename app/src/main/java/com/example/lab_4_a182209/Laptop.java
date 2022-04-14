package com.example.lab_4_a182209;

public class Laptop {
    String brand;
    int image;

    public String getName() {
        return brand;
    }

    public void setName(String brand) {
        this.brand = brand;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Laptop(String brand, int image) {
        this.brand = brand;
        this.image = image;


    }
}
