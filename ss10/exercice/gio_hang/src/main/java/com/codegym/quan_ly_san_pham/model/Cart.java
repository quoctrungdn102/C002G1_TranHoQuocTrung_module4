package com.codegym.quan_ly_san_pham.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> map = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> map) {
        this.map = map;
    }

    private boolean checkItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            if (entry.getKey().getIdProduct().equals(product.getIdProduct())) {
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product, Integer> selectItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            if (entry.getKey().getIdProduct().equals(product.getIdProduct())) {
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (!checkItemInCart(product)) {
            map.put(product, 1);
        } else {
            Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
            Integer newQuantity = itemEntry.getValue() + 1;
            map.replace(itemEntry.getKey(), newQuantity);
        }
    }

    public Map<Product, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Product, Integer> map) {
        this.map = map;
    }

    public void plusCart(Product product) {
        Map.Entry<Product, Integer> entry = selectItemInCart(product);
        assert entry != null;
        entry.setValue(entry.getValue() + 1);
    }

    public void degreeCart(Product product) {
        Map.Entry<Product, Integer> entry = selectItemInCart(product);
        assert entry != null;
        if (entry.getValue() == 1) {
            map.remove(entry.getKey());
        } else {
            entry.setValue(entry.getValue() - 1);
        }
    }
    public void deleteProduct(Product product){
        Map.Entry<Product, Integer> entry = selectItemInCart(product);
        map.remove(entry.getKey());
    }
    public Double totalPrice(){
        Double total =0.0;
        Integer value ;
        for (Map.Entry<Product, Integer> tem :map.entrySet()) {
            value = tem.getValue();
            total+=(Double.parseDouble(tem.getKey().getPrice())*value);
        }
        return total;
    }
}
