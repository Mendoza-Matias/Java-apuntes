
package com.java.clasesabstractas;

import com.java.figuras.rectangulo.Rectangulo;
import com.java.figuras.triangulo.Triangulo;

public class ClasesAbstractas {

    public static void main(String[] args) {
        
        //CREANDO LOS OBJETOS
        Rectangulo rectangulo = new Rectangulo();
        Triangulo cuadrado = new Triangulo();
        
        
        System.out.println("Area rectangulo: " + rectangulo.calcularArea(10, 5));
        System.out.println("Area cuadrado: " + cuadrado.calcularArea(10, 15));
    }
}
