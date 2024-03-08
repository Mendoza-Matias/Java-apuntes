
package com.java.apitime;

import java.time.LocalDate;
import java.time.LocalTime;


public class TrasformarFechaHoras {
    public static void main(String[] args) {
        
        //Sumamos 10 dias a la fecha actual
        
        System.out.println(LocalDate.now().plusDays(20)); //Le suma 20 al dia
        System.out.println(LocalDate.now().plusMonths(2));
        System.out.println(LocalDate.now().plusYears(1));
        
        
        System.out.println(LocalDate.of(2002,12,19).plusDays(1));
        
        //Restar 
        System.out.println(LocalDate.now().minusDays(10));
        
        
        //---------------
        
        System.out.println(LocalTime.now().plusHours(1)); //Con esto le aplicamos a las hora actual.
        
    }
}
