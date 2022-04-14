package com.example.lab_4_a182209;

public class Laptop {
    String brand;
    int image;
    String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Laptop(String brand, int image, String description) {
        this.brand = brand;
        this.image = image;
        this.description= description;


    }
}
