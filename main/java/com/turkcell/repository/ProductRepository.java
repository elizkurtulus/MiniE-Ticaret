package com.turkcell.repository; // Bu sınıfın repository paketinde olduğunu belirtiyoruz.

import com.turkcell.entity.Product;// Order entity sınıfını import ediyoruz.

import java.util.ArrayList;// ArrayList sınıfını import ediyoruz.
import java.util.List; // List interface'ini import ediyoruz.

// ProductRepository sınıfı - IRepository interface'ini implement ediyoruz.
public class ProductRepository implements IRepository<Product> {
    // Sipariş verilerini tutan ArrayList - Generic tip Order
    List<Product> products = new ArrayList<>(); // Sipariş listesini tutar.

    // Default constructor - Parametresiz constructor
    public ProductRepository() {
        // Boş constructor - ArrayList otomatik olarak oluşturulur.
    }

    @Override // IRepository interface'inden gelen add metodunu implement eder.
    public void add(Product entity) {
        products.add(entity); // Ürünü listeye ekler.
        System.out.println("Ürün eklendi!"); // Başarı mesajı.
    }

    @Override // IRepository interface'inden gelen getAll metodunu implement eder.
    public List<Product> getAll()
    {
        return products; // Tüm ürünlerin listesini döner.
    }

    @Override // IRepository interface'inden gelen findById metodunu implement eder.
    public Product findById(int id) {
        // Stream API kullanarak ID'ye göre sipariş arar.
        return products.stream() // Sipariş listesini stream'e çeviriyoruz.
                .filter(product -> product.getId() == id) // ID'ye göre filtreleme yapıyoruz.
                .findFirst()// İlk eşleşen ürünü bulur.
                .orElse(null); // Bulamazsa null döner.
    }
}
