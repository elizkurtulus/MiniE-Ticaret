package com.turkcell.entity; // Bu sınıfın entity paketinde olduğunu belirtiyoruz.

// Customer entity sınıfı - Müşteri bilgilerini temsil eder
public class Customer { // Private field'lar - Encapsulation için private olarak tanımlıyoruz.
    private int Id; // Müşteri ID'si
    private String Name; // Müşteri adı
    private String Email; // Müşteri email adresi
    private String Phone; // Müşteri telefon numarası

    // Default constructor - Parametresiz constructor
    public Customer() {
    }

    // Parametreli constructor - Tüm field'ları alır
    public Customer(int id, String name, String email, String phone) {
        Id = id;// ID field'ını parametre ile set ediyoruz.
        Name = name; // Name field'ını parametre ile set ediyoruz.
        Email = email; // Email field'ını parametre ile set ediyoruz.
        Phone = phone; // Phone field'ını parametre ile set ediyoruz.
    }

    // Getter metodları - Field değerlerini döndürür.
    public int getId() {
        return Id;// ID değerini döndürür.
    }

    public void setId(int id) {
        Id = id;
    } // ID değerini set eder.

    public String getName() {
        return Name; // Name değerini döndürür
    }

    public void setName(String name) {
        Name = name; // Name değerini set eder
    }

    public String getEmail() {
        return Email; // Email değerini döndürür
    }

    public void setEmail(String email) {
        Email = email; // Email değerini set eder
    }

    public String getPhone() {
        return Phone; // Phone değerini döndürür
    }

    public void setPhone(String phone) {
        Phone = phone; // Phone değerini set eder
    }
}
