package com.codegym.blog.service.category_service;

import com.codegym.blog.model.Category;

import java.util.List;

public interface ICategoryService {
    public void saveCategory(Category category);

    public void save(Category category);

    public List<Category> findAll();

    public void delete(Integer id);

    public Category findById(Integer id);


}
