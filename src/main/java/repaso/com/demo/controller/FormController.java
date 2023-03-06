package repaso.com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import repaso.com.demo.models.entity.Contactar;

@Controller
@SessionAttributes("contactar")
public class FormController {
 

    @GetMapping("/form")
    public String form(Model model){
    
        Contactar contactar = new Contactar();
        model.addAttribute("contacto", contactar);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Contactar contactar, BindingResult result, Model model){

        if(result.hasErrors()){

            model.addAttribute("contacto", contactar);
            return "form";
        }

        return "resultado";
    }

    
}
