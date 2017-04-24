package com.example.alexwalker.mylittleshop;

/**
 * Created by alexwalker on 20.04.17.
 */

class Product {
    private String name;
    private String description;
    private String price;

    public Product() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }
}
