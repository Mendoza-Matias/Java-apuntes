/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ej5 {
    public static void main(String[] args) {
        /*Pedir un numero por pantalla y realizar la table de dicho valor
        Por ejemplo la del 5 , 5*1 y asi*/
        
        int valorDeTabla;
        int contador = 1;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingresa un numero y te dare su tabla");
        valorDeTabla = lector.nextInt();
        
        while(contador <=10){
            System.out.println("Tabla del " + valorDeTabla +"x"+contador+":"+ valorDeTabla * contador);
            contador++;
        }
        
        
    }
}
