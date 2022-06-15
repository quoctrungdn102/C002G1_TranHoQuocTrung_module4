package controler_all.controller;

import controler_all.service.DictionaryService;
import controler_all.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("/home")
    public String display() {
        return "Home";
    }

    @Autowired
    IDictionaryService iDictionaryService;

    @PostMapping("/home")
    public String result(@RequestParam(name = "input") String input, Model model) {
        if (iDictionaryService.findByKey(input) == null) {
            model.addAttribute("mes", "not found ");
        } else {
            String result = iDictionaryService.findByKey(input);
            model.addAttribute("result", result);
        }
        return "Home";
    }
}
