package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.blog_service.IBlogService;
import com.codegym.blog.service.category_service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class BlogRestController {
    @Autowired
    ICategoryService iCategoryService;
    @Autowired
    IBlogService iBlogService;

    @GetMapping("displayCategory")
    public ResponseEntity<?> displayListCategory() {
        List<Category> categories = iCategoryService.findAll();
        if (categories == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } else {
            return new ResponseEntity<>(categories, HttpStatus.OK);

        }
    }

    @GetMapping("displayBlog")
    public ResponseEntity<?> displayListBlog() {
        List<Blog> Blogs = iBlogService.display();
        if (Blogs == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(Blogs, HttpStatus.OK);
        }
    }

    @GetMapping("displayBlog/{id}")
    public ResponseEntity<?> displayBlogFindID(@PathVariable("id") Integer id) {
        Blog Blog = iBlogService.viewBlog(id);
        if (Blog == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(Blog, HttpStatus.OK);
        }
    }

    @GetMapping("displayBlogByCategory/{id}")
    public ResponseEntity<?> displayBlogToIdCategory(@PathVariable("id") Integer id) {
        Category category = iCategoryService.findById(id).get();
        Set<Blog> blogs = category.getBlogs();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @PostMapping("creatBlog")
    public ResponseEntity<Blog> creatBlog(@RequestBody Blog blog) {
        iBlogService.create(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> editBlog(@RequestBody Blog blog, @PathVariable("id") Integer id) {
        Blog blog1 = iBlogService.viewBlog(id);
        blog.setIdBlog(blog1.getIdBlog());
        iBlogService.create(blog);
        return new ResponseEntity<>(blog, HttpStatus.CREATED);
    }


}
