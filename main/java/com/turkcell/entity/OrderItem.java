package com.turkcell.entity; // Bu sınıfın entity paketinde olduğunu belirtiyoruz.

// OrderItem entity sınıfı - Sipariş bilgilerini temsil eder.
public class OrderItem {
    // Private field'lar - Encapsulation için private olarak tanımlıyoruz.
    private int ProductId; // Ürün ID'si - Hangi ürün sipariş edildi
    private int Quantity; // Miktar - Kaç adet ürün sipariş edildi
    private double Price; // Birim fiyat - Ürünün birim fiyatı

    // Default constructor - Parametresiz constructor
    public OrderItem() {
    }

    // Parametreli constructor
    public OrderItem(int productId, int quantity, double price) {
        ProductId = productId;// ProductId field'ını parametre ile set ediyoruz.
        Quantity = quantity; // Quantity field'ını parametre ile set ediyoruz.
        Price = price; // Price field'ını parametre ile set ediyoruz.
    }

    // Getter ve Setter metodları - Field'lara erişim sağlar.
    public int getProductId() {
        return ProductId; // ProductId değerini döndürür.
    }

    public void setProductId(int productId) {
        ProductId = productId; // ProductId değerini set eder.
    }

    public int getQuantity() {
        return Quantity; // Quantity değerini döndürür.
    }

    public void setQuantity(int quantity) {
        Quantity = quantity; // Quantity değerini set eder.
    }

    public double getPrice() {
        return Price; // Price değerini döndürür.
    }

    public void setPrice(double price) {
        Price = price; // Price değerini set eder.
    }
}
