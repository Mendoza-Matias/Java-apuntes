/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.variablesalcance;

/**
 *
 * @author Matias
 */
public class VariablesAlcance {//Desde aca hasta donde cierra son variables de clase
    
    private int valor; /*Lo puedo utilizar en el constructor y en cada metodo , no puede estar en la clase como tal*/
    
    public int pruebaUno(int numUno){ //numUno solo lo puedo usar aca.
        return numUno;
    }
    
    //No puedo utilizar variables de un for fuera del bucle
}
