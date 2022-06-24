package com.codegym.quan_ly_san_pham.controller;


import com.codegym.quan_ly_san_pham.model.Product;
import com.codegym.quan_ly_san_pham.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("/")
    public String displayProduct(Model model) {
        List<Product> productList = iProductService.displayProduct();
        model.addAttribute("listProduct", productList);
        return "views/home";
    }

    @GetMapping("/edit/{id}")
    public String goFormEditProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", iProductService.finProductById(id));
        return "views/creat";
    }

    @GetMapping("/creat")
    public String formCreatProduct(Model model) {
        model.addAttribute("product", new Product());
        return "views/creat";
    }

    @PostMapping("/creat")
    public String creatProduct(@Valid Product product, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "views/creat";
        }
        iProductService.creat(product);
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable("id") int id, Model model) {
        Product product = iProductService.finProductById(id);
        model.addAttribute("product", product);
        return "views/view";
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
        return "views/home";
    }

}
