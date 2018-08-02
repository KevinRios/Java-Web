package edu.curso.java.spring.dao;

import edu.curso.java.spring.bo.Persona;
import java.util.List;

public interface PersonaDAO {
        
    public Long guardarPersona(Persona persona);
    public void actualizarPersona(Persona persona);
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    public List<Persona> recuperaPersona();
    
    
    
}
