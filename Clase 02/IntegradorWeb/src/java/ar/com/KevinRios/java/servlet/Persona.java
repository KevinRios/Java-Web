package ar.com.KevinRios.java.servlet;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String email;
    private String Localidad;
    private String Notas;

    public Persona() {
    }

        
    public Persona(String nombre, String apellido, String email, String Localidad, String Notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.Localidad = Localidad;
        this.Notas = Notas;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
        this.Notas = Notas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", Localidad=" + Localidad + ", Notas=" + Notas + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
