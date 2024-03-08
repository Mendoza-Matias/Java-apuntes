/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.conversiones;

/**
 *
 * @author Matias
 */
public class PrimitivosAString {
    public static void main(String[] args) {
        
        String numero = "";
        String caracterString;
        
        byte num1 = 1;
        
        numero = Byte.toString(num1);
        numero = String.valueOf(num1);
        numero = (num1 + "");
        
        short num2 = 2;
        
        numero = Short.toString(num2);
        numero = String.valueOf(num2);
        numero = (num2 + "");
        
        float num3 = 20.5f;
        
        numero = Float.toString(num3); //Metodo 1 devuelve un strin
        numero = String.valueOf(num3); //Metodo 2 almacena un valor de clase String
        numero = (num3 + ""); //Metodo 3 
        
        double num4 = 20.50321d;
        
        numero = Double.toString(num4);
        numero = String.valueOf(num4);
        numero = (num4 + "");
        
        int num5 = 100;
        
        numero = Integer.toString(num5);
        numero = String.valueOf(num5);
        numero = (num5 + "");
        
        long num6 = 4l;
        
        numero = Long.toString(num6);
        numero = String.valueOf(num6);
        numero = (num6 + "");
        
        char letra = 'm';
        
        caracterString = Character.toString(letra);
        caracterString = String.valueOf(letra);
        caracterString = (letra + "");
        
        
        
    }
}
