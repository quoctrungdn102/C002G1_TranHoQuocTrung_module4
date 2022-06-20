package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayProduct();

    void creat(Product product);

    Product finProductById(int id);

    public void editProduct(Product product);

    void deleteProduct(Product product);

    List<Product> findProductByName(String name);

}
