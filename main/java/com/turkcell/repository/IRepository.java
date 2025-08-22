package com.turkcell.repository; // Bu sınıfın repository paketinde olduğunu belirtir.

import java.util.List; // List interface'ini import ediyoruz.

public interface IRepository<T>{ // IRepository interface'i - Generic tip T ile tanımlıyoruz.
    //ekleme-getAll-findById
    void add(T entity); // Yeni entity ekleme metodu
    List<T> getAll(); // Tüm entity'leri listeleme metodu
    T findById(int id); // ID'ye göre entity bulma metodu
}
