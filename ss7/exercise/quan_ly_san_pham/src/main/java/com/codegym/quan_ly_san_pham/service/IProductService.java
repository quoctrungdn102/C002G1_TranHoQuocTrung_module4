package com.codegym.quan_ly_san_pham.service;


import com.codegym.quan_ly_san_pham.model.NhaXe;
import com.codegym.quan_ly_san_pham.model.VeXe;

import java.util.List;

public interface IProductService {
    List<VeXe> displayProduct();

    void creat(VeXe veXe);

    VeXe finProductById(Integer id);


    void deleteProduct(VeXe veXe);

    List<VeXe> findProductByName(String name);

    List<NhaXe> getListCategory();

}
