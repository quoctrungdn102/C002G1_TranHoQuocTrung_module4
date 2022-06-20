package com.codegym.controller;

import com.codegym.model.Application;
import com.codegym.service.IApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ApplicationController {
    @Autowired
    IApplicationService iApplicationService;

    @GetMapping("/")
    public String home(Model model) {
        List<Application> list = iApplicationService.findAll();
        model.addAttribute("list", list);
        return "home";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("Application", new Application());
        return "creat";
    }

    @PostMapping("/creat")
    public String creat(Application application) {
        iApplicationService.creatSong(application);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String goFormEdit(@PathVariable("id") Integer id, Model model) {
        Application application = iApplicationService.findById(id);
        model.addAttribute("application", application);
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(Application application){
        iApplicationService.editSong(application);
        return "redirect:/";
    }
@GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
       Application application= iApplicationService.findById(id);
       iApplicationService.delete(application);
        return "redirect:/";
}

}
