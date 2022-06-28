package com.codegym.quan_ly_san_pham.service;

import com.codegym.quan_ly_san_pham.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    public List<Product> displayList();

    public Optional<Product> findById(Integer id);


}
