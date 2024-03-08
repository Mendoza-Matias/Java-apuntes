
package com.java.recursividad.clases;


public class Factorial {
    
    
    
    //Metodo recursivo
    public int factorialRecursivo(int n){
        
        int resultado = 0;
        
        if(n==1){ //Debe haber al menos una instruccion condicional.
        return 1;
        }
        
        //Al hacer el llamado a si mismo efecturia algo similar a un bucle
        resultado = factorialRecursivo(n-1); //Vamos restando hasta que n == 1
        return resultado;
    }
    
    //Metodo iterativo (Se utilza un bucle para realizar la operación)
    public int factorialInterativo(int n){
        int resultado = 0; //Utiliza un bucle 
        
        for(int i=1;i<=n;i++){
            resultado *= i;
        }
        
        return resultado;
    }
}
