package cotroller_all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerApplication {
    @GetMapping("/")
    public String displayHome(@RequestParam(name = "condiment",required = false) String[] condiment , Model model) {
        model.addAttribute("condiment",condiment);
        return "home";
    }

}
