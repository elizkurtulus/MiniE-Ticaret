package com.turkcell.service;

import com.turkcell.repository.OrderRepository;

public class OrderService {
    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


}
