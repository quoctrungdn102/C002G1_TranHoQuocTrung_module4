package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;

    @GetMapping("/")
    public String home(Model model) {
        List<Blog> list = iBlogService.display();
        model.addAttribute("list", list);
        return "home";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("Blog", new Blog());
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
        return "edit";
    }

    @PostMapping("edit")
    public String editBlog(Blog blog) {
        iBlogService.edit(blog);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteBlog(@PathVariable("id") Integer id) {
        iBlogService.delete(id);
        return "redirect:/";
    }
}
