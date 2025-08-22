package com.turkcell.repository; // Bu sınıfın repository paketinde olduğunu belirtiyoruz.

import com.turkcell.entity.Order; // Order entity sınıfını import ediyoruz.

import java.util.ArrayList;// ArrayList sınıfını import ediyoruz.
import java.util.List; // List interface'ini import ediyoruz.

// OrderRepository sınıfı - IRepository interface'ini implement ediyoruz.
public class OrderRepository implements IRepository<Order> {
    // Sipariş verilerini tutan ArrayList - Generic tip Order
    List<Order> orders = new ArrayList<>(); // Sipariş listesini tutar.

    // Default constructor - Parametresiz constructor
    public OrderRepository() {
        // Boş constructor - ArrayList otomatik olarak oluşturulur.
    }

    @Override // IRepository interface'inden gelen add metodunu implement eder.
    public void add(Order entity) {
        orders.add(entity); // Siparişi listeye ekler.
        System.out.println("Sipariş başarıyla oluşturuldu! Sipariş id: " + entity.getId()); // Başarı mesajı.
    }

    // IRepository interface'inden gelen getAll metodunu implement eder.
    @Override
    public List<Order> getAll()
    {
        return orders; // Tüm sipariş listesini döner.
    }

    // IRepository interface'inden gelen findById metodunu implement eder.
    @Override
    public Order findById(int id) {
        // Stream API kullanarak ID'ye göre sipariş arar.
        return orders.stream() // Sipariş listesini stream'e çeviriyoruz.
                .filter(order -> order.getId() == id) // ID'ye göre filtreleme yapıyoruz.
                .findFirst()// İlk eşleşen siparişi bulur.
                .orElse(null); // Bulamazsa null döner.
    }
}
