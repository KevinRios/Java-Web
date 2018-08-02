package ar.com.KevinRios.Java.Spring.MVC.Form;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;

public class ProductoForm {

    private Long id;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String nombre;

    @NotNull
    @Digits(integer = 8, fraction = 2)
    private Double precio;

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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
