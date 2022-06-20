package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    public List<Product> displayProduct() {
        return iProductRepository.findAll();
    }

    public void creat(Product product) {
        iProductRepository.creatProduct(product);
    }

    @Override
    public Product finProductById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void editProduct(Product product) {
        iProductRepository.editProduct(product);
    }

    public void deleteProduct(Product product) {
        iProductRepository.delete(product);
    }

    public List<Product> findProductByName(String name) {
        return iProductRepository.search(name);
    }

}
