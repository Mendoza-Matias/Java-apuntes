
package com.java.apitime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParsearFechas {
    public static void main(String[] args) {
        
        //Parsear fechas
        
        LocalDate hoy = LocalDate.parse("2023-04-19");
        
        LocalDate fechaParseada = LocalDate.parse("2002-05-19", DateTimeFormatter.ofPattern("dd/MM/YYYY"));
        
        
        //-------Convertir una fecha en un formato de texto
        
        LocalDateTime fechaConHora = LocalDateTime.now();
        
        //Formato por defecto
        
        System.out.println(fechaConHora);
        
        //Formato ISO 8601
        
        System.out.println(fechaConHora.format(DateTimeFormatter.ISO_DATE_TIME)); //Formato de manera explicita
        
        DateTimeFormatter esFormatoEspaniol = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss");
        System.out.println(esFormatoEspaniol); //Manual
        
        /*Con la clase System podemos obtener propiedades del equipo , ya sea idioma o pais*/
    }
}
