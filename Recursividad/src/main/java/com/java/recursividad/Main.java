
package com.java.recursividad;

import com.java.recursividad.clases.Factorial;

public class Main {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        
        System.out.println(factorial.factorialRecursivo(5)); //Mediante una condición para parar
        
        //Factorial interativo
         System.out.println(factorial.factorialInterativo(5)); //Mediante bucles
    }
}
