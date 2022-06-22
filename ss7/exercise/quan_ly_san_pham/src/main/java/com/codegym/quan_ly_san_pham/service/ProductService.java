package com.codegym.quan_ly_san_pham.service;


import com.codegym.quan_ly_san_pham.model.Product;
import com.codegym.quan_ly_san_pham.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public List<Product> displayProduct() {
        return iProductRepository.findAll();
    }

    @Override
    public void creat(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product finProductById(Integer id) {
        return iProductRepository.getById(id);
    }

    @Override
    public void deleteProduct(Product product) {
        iProductRepository.delete(product);
    }

    @Override
    public List<Product> findProductByName(String name) {
        return iProductRepository.search('%' + name + '%');
    }


}
