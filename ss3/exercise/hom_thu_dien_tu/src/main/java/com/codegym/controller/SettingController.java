package com.codegym.controller;

import com.codegym.model.Setting;
import com.codegym.service.ISettingService;
import com.codegym.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SettingController {
    @Autowired
    ISettingService isettingService;

    @GetMapping("/update")
    public String goSetting(Model model) {
        model.addAttribute("setting", new Setting());
        return "form-settings";
    }

    @GetMapping("/")
    public String displaySetting(Model model) {
        Setting setting = isettingService.displaySetting();
        model.addAttribute("setting", setting);
        return "index";
    }

    @PostMapping("/setting")
    public String update(@ModelAttribute("setting") Setting setting, Model model) {
        Setting setting1 = isettingService.saveSetting(setting);
        model.addAttribute("setting", setting1);
        return "index";
    }
}
