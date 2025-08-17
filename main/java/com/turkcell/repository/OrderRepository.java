package com.turkcell.repository;

import com.turkcell.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements IRepository<Order> {
    List<Order> orders = new ArrayList<>();

    public OrderRepository() {
    }

    @Override
    public void add(Order entity) {
        orders.add(entity);
        System.out.println("Order eklendi");
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }

    @Override
    public Order findById(int id) {
        return orders.stream().filter(order -> order.getId() == id)
                .findFirst().orElse(null);
    }
}
