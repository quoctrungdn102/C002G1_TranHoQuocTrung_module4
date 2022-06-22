package com.codegym.quan_ly_san_pham.service;


import com.codegym.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayProduct();

    void creat(Product product);

    Product finProductById(Integer id);


    void deleteProduct(Product product);

    List<Product> findProductByName(String name);

}
