/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.ejerciciospracticospoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class EjerciciosPracticosPoo {

    public static void main(String[] args) {
      /*Crear un programa que haga lo siguiente :
        Crear una clase llamada Automovil , esta clase contara con las siguientes caracteristicas
        
        Atributos 
        Marca String
        Color String
        Potencia int
        Precio double
        
        Metodos : getter , setter y un metodo que permita visualizar todas las caracteristicas del automovil 
        
        Finalmente crear una clase que contenga el metodo public static void main y crear un par de objetos
        de la clase automovil */
    
    
      Automovil Fort = new Automovil();
      
      
      Fort.setMarca("Ford");
      Fort.setColor("Rojo");
      Fort.setPotencia(2000);
      Fort.setPrecio(250.000f);
    
        JOptionPane.showMessageDialog(null, Fort.toString(), "Objeto", 1);
      
    }
}
