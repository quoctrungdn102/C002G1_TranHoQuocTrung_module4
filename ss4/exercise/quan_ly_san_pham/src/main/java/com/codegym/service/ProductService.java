package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    public static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<Integer, Product>();
        productMap.put(1, new Product(1, "iphone5", 1330000, "99%", "USA"));
        productMap.put(2, new Product(2, "iphone6", 1330000, "99%", "USA"));
        productMap.put(3, new Product(3, "iphone7", 1330000, "99%", "USA"));
        productMap.put(4, new Product(4, "iphone8", 1330000, "99%", "USA"));
        productMap.put(5, new Product(5, "iphone13", 1530000, "99%", "USA"));
    }

    public List<Product> displayProduct() {
        return new ArrayList<>(productMap.values());
    }

    public void creat(Product product) {
        productMap.put(product.getIdProduct(), product);
    }

    public void creat1(Product product) {
        productMap.put((productMap.size() + 1), product);


    }

    public Product finProductById(int id) {
        Product product = productMap.get(id);
        return product;
    }

    public int getLastId() {
        List<Product> productList = displayProduct();
        int id = productList.get(productList.size() - 1).getIdProduct() + 1;
        return id;
    }

    public void deleteProduct(int id) {
        productMap.remove(id);
    }

    public List<Product> findProductByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Map.Entry<Integer, Product> tem : productMap.entrySet()) {
            if (tem.getValue().getNameProduct().contains(name)) {
                productList.add(tem.getValue());
            }
        }
        return productList;
    }

}
