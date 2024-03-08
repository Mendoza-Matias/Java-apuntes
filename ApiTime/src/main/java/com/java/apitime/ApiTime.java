
package com.java.apitime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class ApiTime {

    public static void main(String[] args) {
       /*Api recomendada para el manejo de fechas en java 8 en adelante.
        
        Cada clase es independiente de lo que necesito.*/
       
        System.out.println(LocalDate.now());//La fecha actual es (Representa fechas sin horas YYYY,MM,DD);
        System.out.println(LocalTime.now()); //La hora actual es (Horas , Minutos , segundos , nanosegundos)
        System.out.println(LocalDateTime.now());//Obtener hora y fecha actual
        System.out.println(Instant.now()); //Obtener el instante actual
        System.out.println(ZonedDateTime.now()); //Fecha y hora actuales con la zona horaria
       
    }
}
