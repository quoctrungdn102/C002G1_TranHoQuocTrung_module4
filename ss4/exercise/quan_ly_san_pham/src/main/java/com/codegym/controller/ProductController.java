package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("/")
    public String displayProduct(Model model) {
        List<Product> productList = iProductService.displayProduct();
        model.addAttribute("listProduct", productList);
        return "home";
    }

    @GetMapping("/edit/{id}")
    public String goFormEditProduct(@PathVariable("id") int id, Model model) {
        Product product = iProductService.finProductById(id);
        model.addAttribute("product", product);
        return "edit";
    }

    @PostMapping("/edit")
    public String editProduct(Product product1) {
        iProductService.editProduct(product1);
        return "redirect:/";
    }

    @GetMapping("/creat")
    public String formCreatProduct(Model model) {
        model.addAttribute("product", new Product());
        return "creat";
    }

    @PostMapping("/creat")
    public String creatProduct(Product product) {
        iProductService.creat(product);
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable("id") int id, Model model) {
        Product product = iProductService.finProductById(id);
        model.addAttribute("product", product);
        return "view";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
        Product product = iProductService.finProductById(id);
        iProductService.deleteProduct(product);
        redirectAttributes.addFlashAttribute("mes", "Delete successfully");
        return "redirect:/";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam("search") String name, Model model) {
        List<Product> list = iProductService.findProductByName(name);
        model.addAttribute("listProduct", list);
        return "home";
    }

}
