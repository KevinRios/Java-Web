/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.KevinRios.Java.Spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/calculadorasimple")
public class CalculadoraSimpleController {

    @RequestMapping(value = "/mostrar", method = RequestMethod.GET)
    public String saludar(Model model) {
        return "/calculadorasimple/formulario";
    }

    @RequestMapping(value = "/calcular", method = RequestMethod.POST)
    public String calcular(Model model, @RequestParam(value = "operacion") String operacion,
            @RequestParam(value = "num1") int num1,
            @RequestParam(value = "num2") int num2) {

        int total = 0;
        if (operacion.equals("sumar")) {
            total = num1 + num2;
        } else if (operacion.equals("restar")) {
            total = num1 - num2;
        }
        model.addAttribute("total", total);
        return "/calculadorasimple/formulario";
    }

}
