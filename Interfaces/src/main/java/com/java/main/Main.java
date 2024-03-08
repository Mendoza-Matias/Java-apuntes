
package com.java.main;

import com.java.clases.Acumulador;


public class Main {
    public static void main(String[] args) {
        
        Acumulador acumulador = new Acumulador(100);
        
        acumulador.incremento(100);
        
        System.out.println("Incremento " + acumulador.getValor());
        
        
        //----Decremento (Interfaz)-------------
        
        acumulador.decremento(50);
        
        System.out.println("Decremento " +  acumulador.getValor());
    }
}
