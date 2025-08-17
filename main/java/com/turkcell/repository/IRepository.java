package com.turkcell.repository;

import java.util.List;

public interface IRepository<T>{
    //ekleme-getAll-findById
    void add(T entity);
    List<T> getAll();
    T findById(int id);
}
