package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class ControllerEmail {
    private static String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    @GetMapping("/")
    public String displayHome() {
        return "home";
    }
    @PostMapping("/trung")
    public String checkEmail(@RequestParam(name = "email") String email,@RequestParam(name = "pass") String pass, Model model) {
        if (email.matches(REGEX_EMAIL)){
            model.addAttribute("email",email);
            model.addAttribute("pass",pass);
            return "displayEmail";
        }else {
            model.addAttribute("mess","email invalid");
            return "home";
        }

    }
}
