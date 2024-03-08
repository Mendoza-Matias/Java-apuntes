
package com.java.clasesDos;

import com.java.clases.*;

/*Ejemplo de creacion de una clase (Molde)*/
public class Galleta {

    //Atributos
    private String tipo;
    private String forma;
    private String sabor;
    private String color;

    /*Le asignamos el modificador de acceso private para que tengamos que 
    acceder a los atributos de la clase mediante sus metodos*/


    //Constructor vacio
    public Galleta() {

    }

    //Constructor con parametros
    /*
    Metodos propios de la clase
    Metodos getter
    Metodos Setter
    Estos metodos son publicos , asi de esa manera son accesibles por fuera de la clase.
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        /*this.tipo : referencia a la variable del atributo 
        se le asigna el valor pasado como argumento*/
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void recetaUno() {
        System.out.println("Horneamos la galleta y luego le ponemos chocolate");
    }

    void recetaDos() {
        System.out.println("Horneamos la gelleta y luego le ponemos vainilla");
    }

    void recetaTres() {
        System.out.println("Horneamos la galleta y luego le ponemos dulce");
    }

}
