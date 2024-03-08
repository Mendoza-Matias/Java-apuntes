
package com.java.clases;

/*Ejemplo de creacion de una clase (Molde)*/
public class Galleta {
    
    //Atributos
    String tipo;
    String forma;
    String sabor;
    String color;
    
    
    //Constructor
    public Galleta(){
    
    }
   
    
    //Metodos
   
    void recetaUno(){
        System.out.println("Horneamos la galleta y luego le ponemos chocolate");
    }
    
    void recetaDos(){
        System.out.println("Horneamos la gelleta y luego le ponemos vainilla");
    }
    
    void recetaTres(){
        System.out.println("Horneamos la galleta y luego le ponemos dulce");
    }
    
}
