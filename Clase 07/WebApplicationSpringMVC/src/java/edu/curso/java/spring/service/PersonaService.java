package edu.curso.java.spring.service;

import edu.curso.java.spring.bo.Persona;
import edu.curso.java.spring.dao.PersonaDAO;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
    
    private static Log log = LogFactory.getLog(PersonaService.class);
    
    @Autowired
    private PersonaDAO personaDAO;
    
    public Long guardarPersona(Persona persona){
        return personaDAO.guardarPersona(persona);
    }
        
    public void actualizarPersona(Persona persona){
        personaDAO.actualizarPersona(persona);
    }
    
    public void borrarPersona(Long id){
        personaDAO.borrarPersona(id);
    }
    
    public Persona buscarPersona(Long id) {
        return personaDAO.buscarPersona(id);
    }

    public List<Persona> buscarPersonas() {
        return personaDAO.recuperaPersona();
    }
    
    
    
    
    
}
