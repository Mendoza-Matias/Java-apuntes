/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.Main;

import com.java.Clases.Animal;
import com.java.Clases.Perro;
import com.java.Clases.Robot;
import com.java.Clases.Soldado;
import com.java.Clases.Utilidades;
import com.java.Interfaces.Armadura;

/**
 *
 * @author Matias
 */
public class Instance {

    public static void main(String[] args) {
       
        Perro perro = new Perro();
        
        System.out.println(perro instanceof Animal); //Clase hija es una instancia de la clase padre. (Devuelve true)
        
        /*La instancia debe ser de una clase ascendente*/
        
        
        //-----------Instance of con interfaces.
        
        Robot robot = new Robot();
        Soldado soldado = new Soldado();
        
        //Sobreescribo el objeto
        
        System.out.println(robot instanceof Armadura); //ARMADURA ES UNA INTERFACE
        System.out.println(robot instanceof Armadura); //Ahora si devuelve true ya que el soldado hereda de robot y utiliza la interfaz armadura.
   
        Utilidades.esInstanciaDe(robot);
        Utilidades.esInstanciaDe(soldado);
        Utilidades.esInstanciaDe(perro);
        
    }
}
