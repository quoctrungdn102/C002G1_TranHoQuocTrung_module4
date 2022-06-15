package com.example.controler;

import com.example.service.IConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertingController {
    @Autowired
    private IConversionService iConversionService;

    @GetMapping("/trung")
    public String display() {
        return "home";
    }
    @PostMapping("/trung")
    public String total(@RequestParam(name = "num1") double num1, Model model) {
     double result = iConversionService.convert(num1);
        model.addAttribute("result",result);
        return "home";
    }

}

