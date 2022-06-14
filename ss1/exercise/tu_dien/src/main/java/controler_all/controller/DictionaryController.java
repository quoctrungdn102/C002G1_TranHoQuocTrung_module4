package controler_all.controller;
import controler_all.dao.DictionaryDao;
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
    @PostMapping("/home")
    public String result(@RequestParam(name = "input") String input, Model model) {
        if ( DictionaryDao.findByKey(input)==null){
            model.addAttribute("mes","not found ");
        }else {
            String result = DictionaryDao.findByKey(input);
            model.addAttribute("result",result);
        }
        return "Home";

    }


}
