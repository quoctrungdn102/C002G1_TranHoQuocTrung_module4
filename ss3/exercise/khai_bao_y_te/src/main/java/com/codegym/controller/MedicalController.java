package com.codegym.controller;

import com.codegym.model.Medical;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalController {
    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("/")
    public String displayHome(Model model) {
        model.addAttribute("Medical", new Medical());
        model.addAttribute("lisTransport", iMedicalService.lisTransport());
        model.addAttribute("listDay", iMedicalService.listDay());
        model.addAttribute("listMonth", iMedicalService.listMonth());
        model.addAttribute("listYears", iMedicalService.listYears());
        model.addAttribute("listGender", iMedicalService.listGender());
        model.addAttribute("listCountry", iMedicalService.listCountry());
        return "index";
    }

    @PostMapping("/submit")
    public String displayMedical(Model model, @ModelAttribute("Medical") Medical medical) {
        model.addAttribute("medical", medical);
        return "display";
    }

}
