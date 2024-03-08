/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.Main;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Matias
 */
public class ClaseCalendar {

    public static void main(String[] args) {
        //Forma uno
        Calendar fechaUno = Calendar.getInstance(); 
        
        
        //Forma dos 
        Calendar fechaDos = new GregorianCalendar(2500,5,5,5,5);
        
        System.out.println(fechaUno.getTime());//Devuelve la fecha actual del sistema.
        System.out.println(fechaUno.getTimeInMillis());//Devuelve la fecha en milisegundos
        
        fechaUno.set(2023, 10, 23); //Creamos una fecha. Al momento de obtenerla nos trae esta
        
        //Modificar una fecha
        fechaUno.set(Calendar.YEAR, 2030); //Nos devuelve todas las constantes.
    }
}
