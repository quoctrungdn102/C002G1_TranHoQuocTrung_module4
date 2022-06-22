package com.codegym.quan_ly_san_pham.repository;


import com.codegym.quan_ly_san_pham.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "select * from product where name_product like :name", nativeQuery = true)
    List<Product> search(@Param("name") String name);
}
