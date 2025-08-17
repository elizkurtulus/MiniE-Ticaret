package com.turkcell;

import com.turkcell.entity.Customer;
import com.turkcell.entity.OrderItem;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.OrderRepository;
import com.turkcell.repository.ProductRepository;
import com.turkcell.service.CustomerService;
import com.turkcell.service.OrderService;
import com.turkcell.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //repository
        CustomerRepository customerRepository = new CustomerRepository();
        ProductRepository productRepository = new ProductRepository();

        //service
        CustomerService customerService = new CustomerService(customerRepository);
        ProductService productService = new ProductService(productRepository);
        OrderService orderService = new OrderService(new OrderRepository(), productRepository, customerRepository);

        customerService.add(new Customer(1, "eliz", "elizkurtulus@mail", "111111111"));
        customerService.add(new Customer(2, "ferdanur", "ferdanur@mail", "111111111"));
        productService.addProduct(new Product(1, "laptop", 9999.99, 10));
        productService.addProduct(new Product(2, "klavye", 99.99, 15));

        customerService.getCustomers();
        productService.getProducts();

        List<OrderItem> orderItems = new ArrayList<>();
        OrderItem orderItem2 = new OrderItem(1, 3, 9999.99);
        OrderItem orderItem3 = new OrderItem(2, 3, 99.99);
        orderItems.add(orderItem2);
        orderItems.add(orderItem3);

        List<OrderItem> orderItems1 = new ArrayList<>();
        OrderItem orderItem4 = new OrderItem(1, 11, 9999.99);
        orderItems1.add(orderItem4);

        orderService.createOrder(1,1, orderItems);
        orderService.createOrder(1,2, orderItems1);
    }
}