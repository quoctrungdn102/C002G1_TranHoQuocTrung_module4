package com.codegym.quan_ly_san_pham.controller;


import com.codegym.quan_ly_san_pham.model.NhaXe;
import com.codegym.quan_ly_san_pham.model.VeXe;
import com.codegym.quan_ly_san_pham.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("/")
    public String displayProduct(Model model) {
        List<VeXe> veXeList = iProductService.displayProduct();
        model.addAttribute("listProduct", veXeList);
        return "views/home";
    }

    @GetMapping("/edit/{id}")
    public String goFormEditProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", iProductService.finProductById(id));
        return "views/creat";
    }

    @GetMapping("/creat")
    public String formCreatProduct(Model model) {
        model.addAttribute("product", new VeXe());
        return "views/creat";
    }

    @PostMapping("/creat")
    public String creatProduct(@Valid VeXe veXe, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "views/creat";
        }
        iProductService.creat(veXe);
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable("id") int id, Model model) {
        VeXe veXe = iProductService.finProductById(id);
        model.addAttribute("product", veXe);
        return "views/view";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
        VeXe veXe = iProductService.finProductById(id);
        iProductService.deleteProduct(veXe);
        redirectAttributes.addFlashAttribute("mes", "Delete successfully");
        return "redirect:/";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam("search") String name, Model model) {
        List<VeXe> list = iProductService.findProductByName(name);
        model.addAttribute("listProduct", list);
        return "views/home";
    }
    @GetMapping("/listCategory")
    public void listCategory(Model model){
       List<NhaXe> nhaXeList =   iProductService.getListCategory();
    }

}
