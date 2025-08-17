package com.turkcell;

import com.turkcell.entity.Customer;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;
import com.turkcell.repository.ProductRepository;
import com.turkcell.service.CustomerService;
import com.turkcell.service.OrderService;
import com.turkcell.service.ProductService;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService(new CustomerRepository());
        ProductService productService = new ProductService(new ProductRepository());

        customerService.add(new Customer(1, "eliz", "elizkurtulus@mail", "111111111"));
        customerService.add(new Customer(2, "ferdanur", "ferdanur@mail", "111111111"));
        productService.addProduct(new Product(1, "laptop", 9999.99, 10));
        productService.addProduct(new Product(2, "klavye", 99.99, 15));

        customerService.getCustomers();
        productService.getProducts();
    }
}