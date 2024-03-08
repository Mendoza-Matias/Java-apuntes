
package com.java.Main;

import com.java.Main.Clases.Ejemplo;

public class Main {
    public static void main(String[] args) {
        
        
        Ejemplo ejemplo = new Ejemplo();
        
        ejemplo.setAtributoUno(1);
        System.out.println(ejemplo.getContador()); //Cuantas veces se accedio al valor.
        
        Ejemplo ejemploDos = new Ejemplo();
        
    }
}
