
package com.java.conversiones;

public class ConversionEntrePrimitivos {
    public static void main(String[] args) {
        
        byte num1 = 100;
        int num2 = 200;
        
        float num3 = 400.000f; //6 a 7 Decimales
        double num4 = 50.503210130201310d; //15 decimales
        
        /*Conversion de amplicacion primitiva
        Guardo un numero con un rango menor en una variable numerica con un rango mayor.
        Implicita
        */
        
        num2 = num1; //Es posible 
        
        num4 = num3; //Es posible 
        
        /*Conversion de estrechamiento primitivo
        
        Guardo un numero con un rango mayor en una variable numerica con un rango menor.
        Explicita (Manual)
        */
        
        num1 = (byte)num2; //La variable num1 es de tipo byte (Casting)
        
        num3 = (float)num4;
    }
}
