package com.codegym.blog.service.blog_service;


import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.repository.IBlogRepository;
import com.codegym.blog.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Autowired
    private ICategoryRepository iCategoryRepository;

    public List<Blog> display() {
        return iBlogRepository.showList();
    }

    public Page<Blog> display(Pageable pageable) {
        return iBlogRepository.showList(pageable);
    }

    public void create(Blog blog) {
        iBlogRepository.create(blog.getNameBlog(), blog.getContent(),blog.getCategory().getIdCategory());
    }

    public Blog viewBlog(Integer id) {
        Blog blog = iBlogRepository.viewsBlog(id);
        return blog;
    }

    public void edit(Blog blog) {
        iBlogRepository.edit(blog.getNameBlog(), blog.getContent(), blog.getIdBlog(),blog.getCategory().getIdCategory());
    }

    public void delete(Integer id) {
        iBlogRepository.delete(id);
    }
    public List<Category> categoryList(){
      return iCategoryRepository.findAll();
    }

}
