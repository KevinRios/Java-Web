package edu.curso.java.spring.mvc.form;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;


public class CalculadoraForm {

    @NotNull
    @Digits(integer = 8, fraction = 2)
    private Double num1;

    @NotNull
    @Digits(integer = 8, fraction = 2)
    private Double num2;
    
    private String operacion;

    /**
     * @return the num1
     */
    public Double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public Double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    /**
     * @return the operacion
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

}
