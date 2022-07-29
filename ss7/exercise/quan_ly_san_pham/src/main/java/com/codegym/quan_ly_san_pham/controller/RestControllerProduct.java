package com.codegym.quan_ly_san_pham.controller;

import com.codegym.quan_ly_san_pham.model.NhaXe;
import com.codegym.quan_ly_san_pham.model.VeXe;
import com.codegym.quan_ly_san_pham.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("restControllerProduct")


public class RestControllerProduct {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/listProduct")
    public ResponseEntity<?> ListProduct() {
        List<VeXe> veXeList = iProductService.displayProduct();
        return new ResponseEntity<>(veXeList, HttpStatus.OK);
    }
    @GetMapping("/lisCategory")
    public ResponseEntity<?> ListCategory() {
        List<NhaXe> nhaXeList = iProductService.getListCategory();
        return new ResponseEntity<>(nhaXeList, HttpStatus.OK);
    }


}
