package com.example.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerConvert {

    @GetMapping("/trung")
    public String display() {
        return "home";
    }
    @PostMapping("/trung")
    public String total(@RequestParam(name = "num1") double num1, Model model) {
        double total = (num1*24000);
        model.addAttribute("total",total);
        return "home";
    }

}

