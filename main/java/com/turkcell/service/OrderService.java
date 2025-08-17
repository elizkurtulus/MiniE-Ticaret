package com.turkcell.service;

import com.turkcell.entity.Customer;
import com.turkcell.entity.Order;
import com.turkcell.entity.OrderItem;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.OrderRepository;
import com.turkcell.repository.ProductRepository;

import java.util.List;

public class OrderService {
    OrderRepository orderRepository;
    ProductRepository productRepository;
    CustomerRepository customerRepository;

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.customerRepository = customerRepository;
    }

    public void createOrder(int id, int customerId, List<OrderItem> orderItems) {
        double totalPrice = 0;
        for (OrderItem orderItem : orderItems) {
            //stock kontrol
            Product product = productRepository.findById(orderItem.getProductId());
            if (product.getStock() - orderItem.getQuantity() < 0) {
                System.out.println("Yeterli stock yok");
                return;
            }
            product.setStock(product.getStock() - orderItem.getQuantity());
            System.out.println("Product Id: " + product.getId() + " Kalan stock: " + product.getStock());

            //totalPrice hesaplandi
            double orderPrice = orderItem.getQuantity() * orderItem.getPrice();
            totalPrice += orderPrice;
        }
        System.out.println("Toplam ödenen miktar: " + totalPrice);
        Order order = new Order(id, customerId, orderItems, totalPrice);
        orderRepository.add(order);
    }
}
