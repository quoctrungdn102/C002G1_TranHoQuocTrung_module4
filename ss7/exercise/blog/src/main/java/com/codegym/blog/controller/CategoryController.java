package com.codegym.blog.controller;

import com.codegym.blog.model.Category;
import com.codegym.blog.service.category_service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("/create")
    public String creat(Model model) {
        model.addAttribute("category", new Category());
        return "creat-category";
    }

    @PostMapping("/create")
    public String creat(Category category) {
        iCategoryService.save(category);
        return "redirect:/category/display";
    }

    @GetMapping("/display")
    public String list(Model model) {
        model.addAttribute("list", iCategoryService.findAll());
        return "list-category";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("idBlog") Integer id) {
        iCategoryService.delete(id);
        return "redirect:/category/display";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("category", iCategoryService.findById(id));
        return "creat-category";
    }
}
