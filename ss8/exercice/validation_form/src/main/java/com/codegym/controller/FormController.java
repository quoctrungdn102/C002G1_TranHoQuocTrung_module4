package com.codegym.controller;

import com.codegym.model.Form;
import com.codegym.service.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    IFormService iFormService;

    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute("form", new Form());
        return "form";
    }

    @PostMapping("/create")
    public String create(@Valid Form form, BindingResult bindingResult , RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "form";
        } else {
            redirectAttributes.addFlashAttribute("mes","thêm mới thành công ");
            iFormService.create(form );
            return "redirect:/home";
        }

    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("lisForm", iFormService.findAll());
        return "home";
    }
}
