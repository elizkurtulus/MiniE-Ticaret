package com.turkcell.entity; // Bu sınıfın entity paketinde olduğunu belirtiyoruz.

import java.util.ArrayList;// ArrayList sınıfını import ediyoruz.
import java.util.List; // List interface'ini import ediyoruz.

public class Order {
    // Private field'lar - Encapsulation için private olarak tanımlıyoruz.
    private int Id; // Sipariş ID'si
    private int CustomerId; // Müşteri ID'si - Hangi müşterinin siparişi olduğunu belirtir
    private List<OrderItem> orderItems = new ArrayList<>(); // Sipariş kalemleri listesi - Hangi ürünler sipariş edildi
    private double TotalPrice; // Toplam fiyat - Siparişin toplam tutarı

    // Default constructor - Parametresiz constructor
    public Order() {
    }

    // Parametreli constructor
    public Order(int id, int customerId, List<OrderItem> orderItems, double totalPrice) {
        Id = id;// ID field'ını parametre ile set ediyoruz.
        CustomerId = customerId; // CustomerId field'ını parametre ile set ediyoruz.
        this.orderItems = orderItems; // OrderItems field'ını parametre ile set ediyoruz.
        TotalPrice = totalPrice; // TotalPrice field'ını parametre ile set ediyoruz.
    }

    // Getter ve Setter metodları - Field'lara erişim sağlar
    public int getId() {
        return Id; // ID değerini döndürür.
    }

    public void setId(int id) {
        Id = id; // ID değerini set eder.
    }

    public int getCustomerId() {
        return CustomerId; // CustomerId değerini döndürür.
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId; // CustomerId değerini set eder.
    }

    public List<OrderItem> getOrderItems() {
        return orderItems; // OrderItems listesini döndürür.
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems; // OrderItems listesini set eder.
    }

    public double getTotalPrice() {
        return TotalPrice; // TotalPrice değerini döndürür.
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice; // TotalPrice değerini set eder.
    }
}
