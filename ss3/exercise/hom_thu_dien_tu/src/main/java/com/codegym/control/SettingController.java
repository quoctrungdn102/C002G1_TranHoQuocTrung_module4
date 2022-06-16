package com.codegym.control;

import com.codegym.model.Setting;
import com.codegym.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class SettingController {
    @Autowired
    SettingService settingService;

    @GetMapping("/update")
    public String goSetting(Model model) {
        model.addAttribute("setting", new Setting());
        return "form-settings";
    }

    @GetMapping("/")
    public String displaySetting(Model model) {
        Setting setting = settingService.displaySetting();
        model.addAttribute("setting", setting);
        return "index";
    }

    @PostMapping("/setting")
    public String update(@ModelAttribute("setting") Setting setting, Model model) {
        Setting setting1 = settingService.saveSetting(setting);
        model.addAttribute("setting", setting1);
        return "index";
    }
}
