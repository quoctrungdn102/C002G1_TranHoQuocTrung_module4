package com.codegym.blog.service.category_service;

import com.codegym.blog.model.Category;
import com.codegym.blog.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Override
    public void saveCategory(Category category) {
        iCategoryRepository.saveCategory(category.getNameCategory());
    }
    public void save(Category category){
        iCategoryRepository.save(category);
    }
    public List<Category>findAll(){
        return new ArrayList<>(iCategoryRepository.findAll());
    }
    public void delete(Integer id){
        iCategoryRepository.deleteById(id);
    }
    public Category findById(Integer id){
       return iCategoryRepository.getById(id);
    }
}
