
package com.java.bucles;

public class While {

    public static void main(String[] args) {
        
       /*Bucle while
        Se verifica la condicion y se repite la sentencia de codigo
        mientras esta sea verdadera , corta cuando la condicion es falsa o
        esta al iniciar es falsa.
        */ 
        
        int contador = 0;
        
        System.out.println("Ingresa");
        
        while(contador <= 10){
        
            System.out.println(contador);
            
            contador++; //En cada repeticion se aumenta en uno el valor de la varible
        }
        
        System.out.println("Salida");
    }
}
