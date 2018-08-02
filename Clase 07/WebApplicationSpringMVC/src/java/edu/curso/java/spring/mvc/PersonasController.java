package edu.curso.java.spring.mvc;

import edu.curso.java.spring.bo.Persona;
import edu.curso.java.spring.mvc.form.PersonaForm;
import edu.curso.java.spring.service.PersonaService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/personas")
public class PersonasController {
    
    @Autowired
    private PersonaService personaService;
    
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model){
        
        List<Persona> personas = personaService.buscarPersonas();
        model.addAttribute("personas", personas);
        return null;   
        
    }
    @RequestMapping(value = "/nuevo", method = RequestMethod.GET)
    public String nuevo(Model model) throws Exception {

        PersonaForm personaForm = new PersonaForm();
        model.addAttribute("personaForm", personaForm);
        return "/personas/form";
        
    }
    
    
     @RequestMapping(value = "/guardar", method = RequestMethod.POST)
     public String guardar(@ModelAttribute("personaForm") @Valid PersonaForm personaForm, BindingResult result, Model model){
         
         if(result.hasErrors()){
             return "/personas/form";
         }
         
         Long id= personaForm.getId();
         Persona persona = null;
         
         if(id==null){
             // si el id es nulo, no existe todavia, entonces lo crea
             persona = new Persona();
             BeanUtils.copyProperties(personaForm, persona);
             id= personaService.guardarPersona(persona);
         }else{
             // si existe el id, lo actualiza
             persona = personaService.buscarPersona(id);
             BeanUtils.copyProperties(personaForm, persona);
             personaService.actualizarPersona(persona);
         }
         
         //String url="redirect: /personas/";
         String url="/personas/bien";        
         return url;
     }
    
    
    
}
