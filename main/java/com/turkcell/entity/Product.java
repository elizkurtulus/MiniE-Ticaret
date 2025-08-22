package com.turkcell.entity; // Bu sınıfın entity paketinde olduğunu belirtiyoruz.

// Product entity sınıfı - Ürün bilgilerini temsil eder.
public class Product {
    // Private field'lar - Encapsulation için private olarak tanımlıyoruz.
    private int Id; // Ürün ID'si
    private String Name; // Ürün adı
    private double Price; // Ürün fiyatı
    private int Stock; // Stok miktarı

    // Default constructor - Parametresiz constructor
    public Product() {
    }

    // Parametreli constructor
    public Product(int id, String name, double price, int stock) {
        Id = id; // ID field'ını parametre ile set ediyoruz.
        Name = name; // Name field'ını parametre ile set ediyoruz.
        Price = price; // Price field'ını parametre ile set ediyoruz.
        Stock = stock; // Stock field'ını parametre ile set ediyoruz.
    }

    // Getter ve Setter metodları - Field'lara erişim sağlar.
    public int getId() {
        return Id; // ID değerini döndürür.
    }

    public void setId(int id) {
        Id = id; // ID değerini set eder.
    }

    public String getName() {
        return Name; // Name değerini döndürür.
    }

    public void setName(String name) {
        Name = name; // Name değerini set eder.
    }

    public double getPrice() {
        return Price; // Price değerini döndürür.
    }

    public void setPrice(double price) {
        Price = price; // Price değerini set eder.
    }

    public int getStock() {
        return Stock; // Stock değerini döndürür.
    }

    public void setStock(int stock) {
        Stock = stock; // Stock değerini set eder.
    }
}
