/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.Main;

import com.java.Main.Static.Persona;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
        
       Persona.nombre = "Matias"; //Si son estaticas podemos acceder directamente a la variable de la clase.
       
       Persona.division(); //Accedo directamente al metodo sin necesidad de crear un objeto
       
//       Persona.A; 
       //y ahi se le asignara el valor dentro del bloque estatico
    }
}
