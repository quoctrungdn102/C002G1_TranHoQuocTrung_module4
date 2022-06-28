package com.codegym.quan_ly_san_pham.service;

import com.codegym.quan_ly_san_pham.model.Product;
import com.codegym.quan_ly_san_pham.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;
    public List<Product> displayList(){
        return new ArrayList<>(iProductRepository.findAll());
    }
    public Optional<Product> findById(Integer id){
        return iProductRepository.findById(id);
    }
}
