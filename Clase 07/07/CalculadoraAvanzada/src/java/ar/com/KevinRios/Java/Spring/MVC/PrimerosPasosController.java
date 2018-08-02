
package ar.com.KevinRios.Java.Spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/primerospasos")
public class PrimerosPasosController {

    @RequestMapping(value = "/saludar", method = RequestMethod.GET)
    public String saludar(Model model) {
        model.addAttribute("texto", "hola a todos...!!!");
        return null;
    }

    @RequestMapping(value = "/saludar2", method = RequestMethod.GET)
    public String saludar2(Model model) {
        model.addAttribute("texto", "hola a todos...!!! soy saludar 2");
        return "/primerospasos/saludar";
    }

    @RequestMapping(value = "/saludar3", method = RequestMethod.GET)
    public String saludar3(Model model, @RequestParam(value = "nombre") String nombre) {
        model.addAttribute("texto", "hola a todos...!!! soy saludar 3: mi nombre es " + nombre);
        return "/primerospasos/saludar";
    }

    @RequestMapping(value = "/saludar4", method = RequestMethod.POST)
    public String saludar4(Model model, @RequestParam(value = "nombre") String nombre) {
        model.addAttribute("texto", "hola a todos...!!! soy saludar 4: mi nombre es " + nombre);
        return "/primerospasos/saludar";
    }

    @RequestMapping(value = "/saludar5", method = RequestMethod.GET)
    public String saludar5(Model model, @RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "edad") int edad) {
        model.addAttribute("texto", "hola a todos...!!! soy saludar 5: mi nombre es "
                + nombre + " edad: " + edad);
        return "/primerospasos/saludar";
    }

}
