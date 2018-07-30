/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.curso.java.spring.mvc;

import edu.curso.java.spring.bo.Calculadora;
import edu.curso.java.spring.mvc.form.CalculadoraForm;
import edu.curso.java.spring.mvc.form.ProductoForm;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/calculadora")
public class CalculadoraController {
    
    @RequestMapping(value = "/ver", method = RequestMethod.GET)
    public String ver(Model model) {
        CalculadoraForm  calculadoraForm = new CalculadoraForm();
        calculadoraForm.setNum1(0.0);
        calculadoraForm.setNum2(0.0);
        model.addAttribute("calculadoraForm", calculadoraForm);
        return "/calculadora/form";
    }
    @RequestMapping(value = "/calcular", method = RequestMethod.POST)
    public String calcular(Model model, @ModelAttribute("calculadoraForm") @Valid  CalculadoraForm calculadoraForm, BindingResult validadorForm) {
        double total = 0;

        if(!validadorForm.hasErrors()) {
            Calculadora calculadora = new Calculadora();
            if(calculadoraForm.getOperacion().equals("sumar")) {
                total = calculadora.sumar(calculadoraForm.getNum1(), calculadoraForm.getNum2());
            } else if(calculadoraForm.getOperacion().equals("restar")) {
                total = calculadora.restar(calculadoraForm.getNum1(), calculadoraForm.getNum2());
            }
        }
        
        model.addAttribute("calculadoraForm", calculadoraForm);
        model.addAttribute("total", total);
        return "/calculadora/form";
    }
 
}
