package com.java.entradadedatos;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {
       
        /*Entradas de datos por teclado.*/
        
        String nombre;
        int edad;
        float altura;
        
        Scanner lector = new Scanner(System.in);
        
        //Pedido de dato
        System.out.println("Ingresa tu nombre");
        
        //Almacenamiento en variable
        nombre = lector.nextLine(); //String
        
        System.out.println("Ingresa tu edad");
        
        edad = lector.nextInt();
        
        System.out.println("Ingresa tu altura");
        
        altura = lector.nextFloat();
        
        
        System.out.println("Tu nombre es : " +  nombre + " Tu edad es " + edad + " Y mides " + altura);
    }
}
