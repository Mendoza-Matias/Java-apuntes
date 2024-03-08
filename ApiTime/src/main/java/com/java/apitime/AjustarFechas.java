
package com.java.apitime;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;


public class AjustarFechas {
    public static void main(String[] args) {
        
        //Averiguar el primer dia del proximo mes
        
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek()); /*
        Obtener el formato en forma de mes*/
        
    }
}
