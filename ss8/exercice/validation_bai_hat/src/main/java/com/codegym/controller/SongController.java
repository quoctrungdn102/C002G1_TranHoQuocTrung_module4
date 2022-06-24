package com.codegym.controller;

import com.codegym.model.Song;
import com.codegym.repository.ISongRepository;
import com.codegym.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SongController {
    @Autowired
    ISongService iSongService;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("listSong",iSongService.findAll());
        return "home";
    }
    @GetMapping("/creat")
    public String goFormCreat(Model model) {
        model.addAttribute("song", new Song());
        return "form";
    }

    @PostMapping("/create")
    public String creatSong(@Valid Song song, BindingResult bindingResult) {
//        new Song().validate(song,bindingResult);
        if (bindingResult.hasErrors()) {
            return "form";
        }
        iSongService.save(song);
        return "redirect:/";
    }


}
