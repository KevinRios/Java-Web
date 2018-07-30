package edu.curso.java.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value= "/primerospasos")
public class PrimeroPasosController {
    
    @RequestMapping(value = "/saludar", method = RequestMethod.GET)
    public String saludar(Model model){
        model.addAttribute("texto", "hola!!");
        return null;
    }
    
    @RequestMapping(value= "/saludar2", method= RequestMethod.GET)
    public String saludar2(Model model){
        model.addAttribute("texto", "holaaaaaaaaaa");
        String url="/primerospasos/saludar";
        return url;
    }
    
    @RequestMapping(value= "/saludar3", method= RequestMethod.GET)
    public String saludar3(Model model, @RequestParam(value = "nombre") String nombre){
        model.addAttribute("texto", "holaaaa soy el metodo saludar 3, nombre: " + nombre);
        String url="/primerospasos/saludar";
        return url;
    }
    
    @RequestMapping(value="/saludar4", method = RequestMethod.POST)
    public String saludar4(Model model, @RequestParam(value = "nombre") String nombre){
        model.addAttribute("texto", "holaaaa soy el metodo saludar 4, nombre: " + nombre);
        String url="/primerospasos/saludar";
        return url;
    }
    
    @RequestMapping(value= "/saludar5", method= RequestMethod.GET)
    public String saludar5(Model model, @RequestParam(value = "nombre") String nombre, 
                                        @RequestParam(value = "edad") int edad){
        model.addAttribute("texto", "holaaaa soy el metodo saludar 5, nombre: " + nombre + " edad: " + edad);
        String url="/primerospasos/saludar";
        return url;
    }
    
}
