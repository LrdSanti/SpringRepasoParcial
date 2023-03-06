package repaso.com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping({"/", "", "/index"})
    public String index(Model model){
        model.addAttribute("titulo", "Esto es una validacion");
        
        return "index";
    }
}
