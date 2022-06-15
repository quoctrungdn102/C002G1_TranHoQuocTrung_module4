package controller_all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public String goCalculator(){
        return "index";
    }
    @PostMapping("/calculator")
    public String Calculator(@RequestParam(name = "num1",required = false,defaultValue = "0") double num1,
                             @RequestParam(name = "num2",required = false,defaultValue = "0") double num2,
                             @RequestParam(name = "calculator") String calculator,
                             Model model){
        double result=0;
        switch (calculator){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
        }
model.addAttribute("result",result);
        return "index";
    }
}
