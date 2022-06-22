package com.codegym.quan_ly_san_pham.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    private String nameProduct;
    private double price;
    private String description;
    private String producer;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double price, String description, String producer) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public Product(String nameProduct, double price, String description, String producer) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
