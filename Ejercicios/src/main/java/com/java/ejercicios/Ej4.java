
package com.java.ejercicios;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        /*Se pide realizar un programa en el cual se deben ingresar tres
        numeros por pantalla y ordenarlos de mayor a menor (Devolver el resultado)
        Ejmplo : ingresa 4,5,2
        Devuelve 5,4,2*/
        
        
        int numUno,numDos,numTres;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        numUno = lector.nextInt();
        
        System.out.println("Ingresa otro numero");
        numDos = lector.nextInt();
        
        System.out.println("Ingresa el ultimo numero");
        numTres = lector.nextInt();
        
        if (numTres > numDos && numUno < numDos) {
            System.out.println("Orden a " + numTres + " " + numDos + " " + numUno);
        } else if (numUno > numDos && numDos < numTres) {
            System.out.println("Orden b " + numTres + " " + numUno + " " + numDos);
        } else if (numDos > numTres && numTres > numUno) {
            System.out.println("Orden c " + numDos + " " + numTres + " " + numUno);
        } else if (numUno > numDos && numTres > numDos) {
            System.out.println("Orden d" + numUno +" "+ numTres +" "+ numDos);
        } else {
            System.out.println("No haz ingresado ningun valor");
        }

    }
}
