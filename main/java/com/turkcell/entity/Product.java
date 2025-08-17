package com.turkcell.entity;

public class Product {
    private int Id;
    private String Name;
    private double Price;
    private int Stock;

    public Product() {
    }

    public Product(int id, String name, double price, int stock) {
        Id = id;
        Name = name;
        Price = price;
        Stock = stock;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}
