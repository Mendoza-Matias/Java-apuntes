
package com.java.ejerciciopracticopoo_tres;

import java.util.Scanner;



public class Utilidades {
    
    //Atributos
    
    //Constructores
    
    //Metodos
    
    public void realizarOperacion() {
        int numeroUno;
        int numeroDos;
        int operacion = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        numeroUno = lector.nextInt();

        System.out.println("Elige una operacion : SUMA : 1 / RESTA : 2 / DIVISION : 3 / MULTIPLICACION 4");
        operacion = lector.nextInt();

        System.out.println("Ingresa otro numero");
        numeroDos = lector.nextInt();

        switch (operacion) {
            case 1:
                System.out.println(suma(numeroUno, numeroDos));
                break;
            case 2:
                System.out.println(resta(numeroUno, numeroDos));
                break;
            case 3:
                System.out.println(division(numeroUno, numeroDos));
                break;
            case 4:
                System.out.println(multiplicacion(numeroUno, numeroDos));
                break;

        }
    }

    public int suma(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }

    public int resta(int numeroUno, int numeroDos) {
        return numeroUno - numeroDos;
    }

    public int multiplicacion(int numeroUno, int numeroDos) {
        return numeroUno * numeroDos;
    }

    public int division(int numeroUno, int numeroDos) {
        return numeroUno / numeroDos;
    }
       
     
      
}
