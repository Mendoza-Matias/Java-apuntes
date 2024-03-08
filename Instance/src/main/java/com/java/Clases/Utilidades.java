
package com.java.Clases;

public class Utilidades {
    public static void esInstanciaDe(Object object){
        if(object instanceof Animal){
            System.out.println("Es instancia de animal");
        }else if(object instanceof Robot){
            System.out.println("Es instancia de robot");
        }else{
            System.out.println("No es instancia de nadie");
        }
    }
}
