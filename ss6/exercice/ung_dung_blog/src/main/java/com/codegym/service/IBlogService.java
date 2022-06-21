package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogService {
    public List<Blog> display();

    public void create(Blog blog);

    public Blog viewBlog(Integer id);

    public void edit(Blog blog);

    public void delete(Integer id);


}
