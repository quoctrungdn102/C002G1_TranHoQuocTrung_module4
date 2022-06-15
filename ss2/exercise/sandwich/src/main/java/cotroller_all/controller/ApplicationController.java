package cotroller_all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ApplicationController {
    @GetMapping("/trung")
    public String displayHome(@RequestParam(name = "condiment", required = false) String[] condiment,
                              RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("condiment", condiment);
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String goHome() {
        return "home";
    }
}
