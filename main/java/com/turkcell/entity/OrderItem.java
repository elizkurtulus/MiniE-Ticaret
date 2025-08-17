package com.turkcell.entity;

public class OrderItem {
    private int ProductId;
    private int Quantity;
    private double Price;

    public OrderItem() {
    }

    public OrderItem(int productId, int quantity, double price) {
        ProductId = productId;
        Quantity = quantity;
        Price = price;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
