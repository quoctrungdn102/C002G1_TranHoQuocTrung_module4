package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    public void creatProduct(Product product);

    public List<Product> findAll();

    public void editProduct(Product product);

    public Product findById(int id);

    public void delete(Product product);

    public List<Product> search(String name);
}
