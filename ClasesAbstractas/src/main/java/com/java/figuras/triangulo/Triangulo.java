
package com.java.figuras.triangulo;

//Definiendo una clase abstracta

import com.java.figuras.Figuras;

public class Triangulo extends Figuras {

    //Atributos
    public String tipo; //Esto tiene que ser privado
    
    @Override
    public double calcularArea(double base, double altura) {
       return (base*altura / 2);
    }
   
}
