
package com.java.ejerciciospracticospoo_dos;

import java.util.Scanner;

public class Utilidades {
    //Atributos
    
    
    //Constructor
    
    
    //Metodos
    public float ingresaUnNumero(){
        
        float numeroIngresado;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        
        numeroIngresado = lector.nextFloat();
        
        return numeroIngresado;
    }
    
    public float aplicarIva(float valorIngresado){
    
        float valorConIva = (valorIngresado * 1.21f);
        
        return valorConIva;
    }
    
    public float mostrarResultadoFinal(float resultadoFinal){
        
        return resultadoFinal;
    }
    
  
}
