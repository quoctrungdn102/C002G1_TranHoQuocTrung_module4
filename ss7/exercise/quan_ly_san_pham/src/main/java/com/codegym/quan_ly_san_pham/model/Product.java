package com.codegym.quan_ly_san_pham.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Product implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    @NotBlank(message = "tên không được để trống")
    @Pattern(regexp = "^\\w*$",message ="tên không được chứa kí tự đặc biệt" )
    private String nameProduct;
    @Pattern(regexp = "^[1-9]|[0-9]{2,}$",message ="lớn hơn không  " )
    private String price;
    @NotBlank(message = "không được để trống ")
    private String description;
    @NotBlank(message = "không được để trống")
    private String producer;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String price, String description, String producer) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public Product(String nameProduct, String price, String description, String producer) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public Product(int id) {
        this.idProduct = id;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
