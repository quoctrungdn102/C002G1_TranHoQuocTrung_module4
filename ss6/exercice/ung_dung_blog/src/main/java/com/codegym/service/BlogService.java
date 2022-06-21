package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    public List<Blog> display() {
        return iBlogRepository.showList();
    }

    public void create(Blog blog) {
        iBlogRepository.create(blog.getNameBlog(), blog.getContent());
    }

    public Blog viewBlog(Integer id) {
        Blog blog = iBlogRepository.viewsBlog(id);
        return blog;
    }

    public void edit(Blog blog) {
        iBlogRepository.edit(blog.getNameBlog(), blog.getContent(), blog.getIdBlog());
    }

    public void delete(Integer id) {
        iBlogRepository.delete(id);
    }

}
