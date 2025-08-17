package com.turkcell.service;

import com.turkcell.entity.Product;
import com.turkcell.repository.ProductRepository;

import java.util.List;

public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        productRepository.add(product);
    }

    public void getProducts() {
        for(Product product : productRepository.getAll()) {
            System.out.println("Product Id: " + product.getId() + " Product Name: " + product.getName()
                    + " Price: " + product.getPrice() + " Stock: " + product.getStock());
        }
    }

    public int checkStock(int id) {
        Product product = productRepository.findById(id);
        return product.getStock();
    }
}
