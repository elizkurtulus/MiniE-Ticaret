package com.turkcell.repository;

import com.turkcell.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IRepository<Product> {
    List<Product> products = new ArrayList<>();

    public ProductRepository() {
    }

    @Override
    public void add(Product entity) {
        products.add(entity);
        System.out.println("Product eklendi.");
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return products.stream().filter(product -> product.getId() == id)
                .findFirst().orElse(null);
    }
}
