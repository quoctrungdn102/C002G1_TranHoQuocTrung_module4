package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.blog_service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;

    @GetMapping(value = "/")
    public String home(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
//        Sort sort = Sort.by("name_blog").ascending();
        Page<Blog> list = iBlogService.display(PageRequest.of(page, 2));
        model.addAttribute("list", list);
        return "home";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("Blog", new Blog());
        List<Category> categoryList = iBlogService.categoryList();
        model.addAttribute("categoryList", categoryList);
        return "creat";
    }

    @PostMapping("/create")
    public String create(Blog blog) {
        iBlogService.create(blog);
        return "redirect:/";
    }

    @GetMapping("/views/{id}")
    public String viewBlog(@PathVariable("id") Integer id, Model model) {
        Blog blog = iBlogService.viewBlog(id);
        model.addAttribute("blog", blog);
        return "info";
    }

    @GetMapping("/edit/{id}")
    public String GoEditBlog(@PathVariable("id") Integer id, Model model) {
        Blog blog = iBlogService.viewBlog(id);
        model.addAttribute("blog", blog);
        List<Category> categoryList = iBlogService.categoryList();
        model.addAttribute("categoryList", categoryList);

        return "edit";
    }

    @PostMapping("edit")
    public String editBlog(Blog blog) {
        iBlogService.edit(blog);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteBlog(@RequestParam("idBlog") Integer id) {
        iBlogService.delete(id);
        return "redirect:/";
    }
}
