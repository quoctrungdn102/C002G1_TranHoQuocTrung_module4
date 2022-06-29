package com.codegym.blog.service.category_service;

import com.codegym.blog.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    public void saveCategory(Category category);

    public void save(Category category);

    public List<Category> findAll();

    public void delete(Integer id);

    public Optional<Category> findById(Integer id);


}
