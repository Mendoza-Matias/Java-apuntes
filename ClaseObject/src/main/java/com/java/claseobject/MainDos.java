
package com.java.claseobject;

import com.java.claseobject.clases.Persona;


public class MainDos {
    public static void main(String[] args) {
        
     Persona personaUno = new Persona("Matias","Mendoza","44547239",20);
     Persona personaDos = new Persona("Matias","Mendoza","44547239",20);
     
        /*Podemos modificar el metodo para que aun asi tome otros datos y realice comparaciones
        Las comparaciones podemos hacerlas mas adaptadas.
        Para eso ingresamos al metodo equals y realizamos nuestros cambios
        */
        System.out.println("Son iguales " + personaUno.equals(personaDos));
        
        //Metodo getClass();
        
        System.out.println(personaUno.getClass().getName()); 
        /*Si usamos solo el getClass nos da toda la información perteneciente a la clase
        
        Podemos acceder a otras caracteristicas con un .y otros metodos*/
        
    }
}
