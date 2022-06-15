package cotroller_all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ApplicationController {
    @GetMapping("/trung")
    public String displayHome(@RequestParam(name = "condiment", required = false) String[] condiment, Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("condiment", condiment);
        redirectAttributes.addFlashAttribute("condiment",condiment);
        return "redirect:/home";
    }
    @GetMapping("/home")
    public String displayHome() {
        return "home";
    }
}
