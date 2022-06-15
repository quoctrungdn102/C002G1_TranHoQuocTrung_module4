package controller_all.controller;

import controller_all.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String goCalculator() {
        return "index";
    }

    @PostMapping("/calculator")
    public String Calculator(@RequestParam(name = "num1", required = false, defaultValue = "0") double num1,
                             @RequestParam(name = "num2", required = false, defaultValue = "0") double num2,
                             @RequestParam(name = "calculator") String calculator,
                             Model model) {
        double result = iCalculatorService.Calculator(calculator, num1, num2);
        model.addAttribute("result", result);
        return "index";
    }
}
