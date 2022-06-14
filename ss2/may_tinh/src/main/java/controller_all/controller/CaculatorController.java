package controller_all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public String goCalculator(){
        return "index";
    }
    @PostMapping("/")
    public String Calculator(@){

        return "index";
    }
}
