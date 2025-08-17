package com.turkcell.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int Id;
    private int CustomerId;
    private List<OrderItem>  orderItems = new ArrayList<>();
    private double TotalPrice;

    public Order() {
    }

    public Order(int id, int customerId, List<OrderItem> orderItems, double totalPrice) {
        Id = id;
        CustomerId = customerId;
        this.orderItems = orderItems;
        TotalPrice = totalPrice;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }
}
