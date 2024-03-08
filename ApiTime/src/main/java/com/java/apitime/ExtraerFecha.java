/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.apitime;

import java.time.LocalDate;
import java.time.LocalTime;

public class ExtraerFecha {
    public static void main(String[] args) {
        
        //Obtener algun dato de la fecha en concreto.
        
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getMonthValue()); //Nos devuelve un numero entre 1 y 12
        
        
        //Obtener algun dato en concreto de una hora o tiempo.
        System.out.println(LocalTime.now().getHour());
        System.out.println(LocalTime.now().getSecond()); //Nos devuelve los segundos
        System.out.println(LocalDate.of(2023,10,19).getMonth());
        
    }
}
