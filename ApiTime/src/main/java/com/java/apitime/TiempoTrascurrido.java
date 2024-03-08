
package com.java.apitime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class TiempoTrascurrido {
    public static void main(String[] args) {
        
        LocalDate fechaDeNacimiento = LocalDate.of(2002, Month.DECEMBER, 19);
        
        //Tiempo transcurrido en años entre mi fecha de nacimiento y fecha actual
        
        System.out.println(ChronoUnit.YEARS.between(fechaDeNacimiento, LocalDate.now()));
        /*Primero la fecha de nacimiento y despues la otra fecha
        
        Si cambio YEARS por minutos */
        
        
        //Calcular cuanto tiempo falta para llegar a final de año
        
        LocalDate fechaActual = LocalDate.now();
        LocalDate finAnio = fechaActual.with(TemporalAdjusters.lastDayOfYear()); /*Ultimo dia del año*/
    }
}
