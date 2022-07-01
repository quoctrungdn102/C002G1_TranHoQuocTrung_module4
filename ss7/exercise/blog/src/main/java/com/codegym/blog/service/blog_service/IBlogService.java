package com.codegym.blog.service.blog_service;


import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    public List<Blog> display();

    public void create(Blog blog);

    public Blog viewBlog(Integer id);

    public void edit(Blog blog);

    public void delete(Integer id);

    public Page<Blog> display(Pageable pageable);

    public List<Category> categoryList();

    public List<Blog> searchBlog(String name);


}
