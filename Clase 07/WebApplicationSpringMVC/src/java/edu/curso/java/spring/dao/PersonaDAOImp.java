package edu.curso.java.spring.dao;

import edu.curso.java.spring.bo.Persona;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDAOImp implements PersonaDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Long guardarPersona(Persona persona) {
       sessionFactory.getCurrentSession().save(persona);
       return persona.getId();
    }

    @Override
    public void actualizarPersona(Persona persona) {
        sessionFactory.getCurrentSession().update(persona);
        
    }

    @Override
    public void borrarPersona(Long id) {
        Persona persona = this.buscarPersona(id);
        sessionFactory.getCurrentSession().delete(persona);
    }

    @Override
    public Persona buscarPersona(Long id) {
           return (Persona) sessionFactory.getCurrentSession().get(Persona.class, id);
    }

    @Override
    public List<Persona> recuperaPersona() {
        String query = "from Persona";
        return sessionFactory.getCurrentSession().createQuery(query).list();
    }
    
}
