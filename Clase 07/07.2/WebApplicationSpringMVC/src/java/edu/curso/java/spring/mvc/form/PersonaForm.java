package edu.curso.java.spring.mvc.form;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

public class PersonaForm {
    
    private Long id;
       
    @NotEmpty
    @Size(min = 3, max = 50)
    private String nombre;
    
    @NotEmpty
    @Size(min = 3, max = 50)
    private String apellido;
    
    
    private int dni;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
}
