/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.pasoporvalor;

/**
 *
 * @author Matias
 */
public class PasoPorValor {
    /*Paso por valor*/
    
    public static void main(String[] args) {
      
        int x = 10;
        
        System.out.println("x es igual " + x);
        
        cambiarValor(x);
        
        System.out.println("X despues de cambiar el valor" + x);
    }
    //La x seguira valiendo 10
    
    public static void cambiarValor(int x){//Al ser estatico lo puedo llamar desde aca
    
        System.out.println("valor del parametro" + x);
        
        x=20; //Esto no va a funcionar
    }
}
