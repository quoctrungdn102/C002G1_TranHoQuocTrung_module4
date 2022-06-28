package com.codegym.quan_ly_san_pham.controller;

import com.codegym.quan_ly_san_pham.model.Cart;
import com.codegym.quan_ly_san_pham.model.Product;
import com.codegym.quan_ly_san_pham.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("cart")
public class ProductController {


    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Cart creatProduct() {
        return new Cart();
    }

    @GetMapping("/addCart/{id}")
    public String addToCart(@PathVariable("id") Integer id, @ModelAttribute("cart") Cart cart) {
        Product product = iProductService.findById(id).get();
        cart.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/myCart")
    public String myCart(@ModelAttribute("cart") Cart cart, Model model) {
        model.addAttribute("cart", cart);
        return "cart";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("product", iProductService.displayList());
        return "home";
    }

    @GetMapping("view/{id}")
    public String view(@PathVariable("id") Integer id, Model model) {
        Product product = iProductService.findById(id).get();
        model.addAttribute("product", product);
        return "view";
    }

    @GetMapping("/plus/{id}")
    public String plusCart(@PathVariable("id") Integer id,@ModelAttribute("cart") Cart cart) {
        Product product = iProductService.findById(id).get();
        cart.plusCart(product);
        return "redirect:/myCart";
    }
    @GetMapping("/degree/{id}")
    public String degreeCart(@PathVariable("id") Integer id,@ModelAttribute("cart") Cart cart) {
        Product product = iProductService.findById(id).get();
        cart.degreeCart(product);
        return "redirect:/myCart";
    }

}
