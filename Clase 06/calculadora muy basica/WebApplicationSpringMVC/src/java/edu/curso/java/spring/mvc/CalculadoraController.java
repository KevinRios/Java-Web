package edu.curso.java.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/calculadora")
public class CalculadoraController {

    @RequestMapping(value = "/formCalculadora")
    public String formulario(Model model) {
        String url = "/calculadora/formCalculadora";
        return url;
    }

    @RequestMapping(value = "/suma", method = RequestMethod.POST)
    public String suma(Model model,
            @RequestParam(value = "numero1") int numero1,
            @RequestParam(value = "numero2") int numero2) {
        
        int resultado = numero1 + numero2;
        //String res = String.valueOf(resultado);
        model.addAttribute("resultado", resultado);
        String url = "/calculadora/formCalculadora";
        return url;
    }

}
