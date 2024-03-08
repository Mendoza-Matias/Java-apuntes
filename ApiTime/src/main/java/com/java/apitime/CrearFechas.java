
package com.java.apitime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class CrearFechas {
    public static void main(String[] args) {
        /*Construir fechas y horas con la Api de Time*/
        
        System.out.println(LocalDate.of(2002, Month.DECEMBER, 19)); //Generar una fecha Concreta
        
        //Generar una fecha con horas , minutos y segundos
        
        System.out.println(LocalDateTime.of(2002, Month.DECEMBER, 19, 4, 50,25)); //Año , mes , dia , hora , minuto , segundos
        
        
        //Generar una fecha erronea
        
        System.out.println(LocalDate.of(2002, Month.DECEMBER, 19)); //Si los dias no estan disponibles me tirara un error.
    }
}
