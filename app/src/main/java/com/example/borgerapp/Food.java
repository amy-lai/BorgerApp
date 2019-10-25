package com.example.borgerapp;

public class Food {
 private String name;
 private String desc;
 private double price;
 private int imageSource;


    public Food(String name, String desc, double price, int imageSource) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.imageSource = imageSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @NonNull
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }

}
