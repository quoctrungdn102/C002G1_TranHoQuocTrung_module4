package com.codegym.quan_ly_san_pham.service;


import com.codegym.quan_ly_san_pham.model.NhaXe;
import com.codegym.quan_ly_san_pham.model.VeXe;
import com.codegym.quan_ly_san_pham.repository.ICategoryService;
import com.codegym.quan_ly_san_pham.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Autowired
    ICategoryService iCategoryService;


    @Override
    public List<VeXe> displayProduct() {
        return iProductRepository.findAll();
    }

    @Override
    public void creat(VeXe veXe) {
        iProductRepository.save(veXe);
    }

    @Override
    public VeXe finProductById(Integer id) {
        return iProductRepository.findById(id).get();
    }

    @Override
    public void deleteProduct(VeXe veXe) {
        iProductRepository.delete(veXe);
    }

    @Override
    public List<VeXe> findProductByName(String name) {
        return iProductRepository.search('%' + name + '%');
    }

    @Override
    public List<NhaXe> getListCategory() {
        return iCategoryService.findAll() ;
    }


}
