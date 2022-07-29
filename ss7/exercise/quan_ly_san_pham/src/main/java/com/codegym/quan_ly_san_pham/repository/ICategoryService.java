package com.codegym.quan_ly_san_pham.repository;

import com.codegym.quan_ly_san_pham.model.NhaXe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICategoryService extends JpaRepository<NhaXe,Integer> {
}
