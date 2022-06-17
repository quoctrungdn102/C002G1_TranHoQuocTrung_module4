package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayProduct();

    void creat(Product product);

    Product finProductById(int id);

    int getLastId();

    void deleteProduct(int id);

    List<Product> findProductByName(String name);

}
