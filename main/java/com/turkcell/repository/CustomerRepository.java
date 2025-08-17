package com.turkcell.repository;

import com.turkcell.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IRepository<Customer> {
    List<Customer> customers = new ArrayList<>();

    public CustomerRepository() {
    }

    @Override
    public void add(Customer entity) {
        customers.add(entity);
        System.out.println("Ekleme yapıldı");
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        return customers.stream().filter(customer -> customer.getId() == id)
                .findFirst().orElse(null);
    }
}
