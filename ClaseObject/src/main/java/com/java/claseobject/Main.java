/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.claseobject;

import com.java.claseobject.clases.Melon;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {
       
        
        Melon melon = new Melon("Melon amarillo","Grande",5);
        
        melon.toString(); //Metodo toString (Nos devuelve la firma del objeto)
        //Lo normal es que se sobreescriba el metodo toString.
    }
}
