package com.turkcell.repository; // Bu sınıfın repository paketinde olduğunu belirtiyoruz.

import com.turkcell.entity.Customer; // Customer entity sınıfını import ediyoruz.

import java.util.ArrayList; // ArrayList sınıfını import ediyoruz.
import java.util.List; // List interface'ini import ediyoruz.

// CustomerRepository sınıfı - IRepository interface'ini implement ediyoruz.
public class CustomerRepository implements IRepository<Customer> {
    // Müşteri verilerini tutan ArrayList - Generic tip Customer
    List<Customer> customers = new ArrayList<>(); // Müşteri listesini tutar.

    public CustomerRepository() { // Default constructor - Parametresiz constructor
        // Boş constructor - ArrayList otomatik olarak oluşturulur.
    }

    // IRepository interface'inden gelen add metodunu implement eder.
    @Override
    public void add(Customer entity) {
        customers.add(entity); // Müşteriyi listeye ekler.
        System.out.println("Müşteri eklendi!"); // Başarı mesajı yazdırır.
    }

    // IRepository interface'inden gelen getAll metodunu implement eder.
    @Override
    public List<Customer> getAll()
    {
        return customers; // Tüm müşteri listesini döner.
    }

    // IRepository interface'inden gelen findById metodunu implement eder.
    @Override
    public Customer findById(int id) {
        // Stream API kullanarak ID'ye göre müşteri arar.
        return customers.stream()// Müşteri listesini stream'e çevirir
                .filter(customer -> customer.getId() == id) // ID'ye göre filtreleme yapar.
                .findFirst() // İlk eşleşen müşteriyi bulur.
                .orElse(null); // Bulunamazsa null döner.
    }
}
