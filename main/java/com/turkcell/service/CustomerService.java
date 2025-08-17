package com.turkcell.service;
import com.turkcell.entity.Customer;
import com.turkcell.entity.Product;
import com.turkcell.repository.CustomerRepository;

import java.util.List;

public class CustomerService {
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    public void getCustomers() {
        for(Customer customer : customerRepository.getAll()) {
            System.out.println("Customer Id: " + customer.getId() + " Customer Name: " + customer.getName()
            + " Customer Email: " + customer.getEmail() + " Customer Phone: " + customer.getPhone());
        }
    }

    public Customer findCustomer(int id) {
        return customerRepository.findById(id);
    }
}
