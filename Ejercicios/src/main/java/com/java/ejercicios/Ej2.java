
package com.java.ejercicios;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        
        /*Realiza un programa que reciba dos numeros por teclado e indique cual de los dos es mayor 
        o si son iguales.*/
        
        int primerNumero;
        int segundoNumero;
        Scanner lector = new Scanner(System.in);
        
        
        System.out.println("Ingresa un numero");
        
        primerNumero = lector.nextInt();
        
        System.out.println("Ingresa un segundo numero");
        
        segundoNumero = lector.nextInt();
        
        if(primerNumero > segundoNumero){
            System.out.println("El numero " + primerNumero + " es mayor al " + segundoNumero);
        }else if(segundoNumero > primerNumero){
            System.out.println("El numero " + segundoNumero + " es mayor al " + primerNumero);
        }else if(primerNumero == segundoNumero){
            System.out.println("Ambos numeros son iguales");
        }else{
            System.out.println("No haz ingresado ningun numero");
        }
        
        
    }
}
