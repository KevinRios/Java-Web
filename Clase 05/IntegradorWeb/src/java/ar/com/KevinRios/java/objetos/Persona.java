package ar.com.KevinRios.java.objetos;

public class Persona {

    private int idPersona;
    private String nombre;
    private String apellido;
    private String notas;
    private String email;
    private String localidad;
    private double sueldo;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String notas, String email, String localidad, double sueldo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
        this.email = email;
        this.localidad = localidad;
        this.sueldo = sueldo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }




    

    
}
