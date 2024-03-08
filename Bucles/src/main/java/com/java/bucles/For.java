
package com.java.bucles;
public class For {
    public static void main(String[] args) {
        /*Bucle For : consume la inicializacion , la condicion y el incremento
        decremento en una linea proporcionando asi una estructura de bucle mas 
        corta y facil de entender .
        Mayormente se utiliza para recorrer elementos
        Itera mientras la condicion sea 
        verdadera hasta que la condicion sea falsa.*/
        
        
        System.out.println("Inicio del codigo");
        for(int contador = 0; contador <= 10 ; contador++){
            System.out.println("Iteracion" + " " + contador);
            
            /*El alcance de la variable es local, osea dentro del for*/
        }
        System.out.println("Salida");
    }
}
