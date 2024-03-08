
package com.java.clasestring;


public class MainDos {

    public static void main(String[] args) {
        /*Los string son inmutables*/
        
        
        String textoUno = "Hola como estas";/*Este string es inmutable
        Si creo un objeto y le asigno otro valor , lo que se hace es 
        definir otro objeto y el creado principalemente , es inmutable
        Osea que ambos apuntan a dos distintos espacios en memoria.*/
        
        String textoDos = textoUno.substring(4); //Extrae del texto 1 hasta el Hola, muestra el como estas;
        
        System.out.println(textoDos);
    }
}
