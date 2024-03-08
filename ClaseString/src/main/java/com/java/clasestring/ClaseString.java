/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.clasestring;

/**
 *
 * @author Matias
 */
public class ClaseString {

    public static void main(String[] args) {
        /*Clase String*/
        
        String textoUno = new String("Hola"); //Crean un objeto de la clase String
        //FORMA UNO (No se suele hacer de esta manera)
        
        String textoDos = "texto dos"; //Crear un String de forma directa
        
        //Forma 3
        
        String textoTres = new String("texto tres");
        
        //No es una forma de crear String
        String textoCuatro = textoTres; //Creamos otro texto a partir del objeto ya creado.
        
        System.out.println(textoUno);
    }
}
