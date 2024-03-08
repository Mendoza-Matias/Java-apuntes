
package com.java.estructurasdecontrol;

public class Switch {

    public static void main(String[] args) {

        /*Sentencia de control Switch: esta no evalua una condicion logica , sino
        que evalua un valor de tipo entero primitivo . La instruccion
        tendrea definidos ciertos casos que se ejecutaran dependiendo del valor evaluado*/
        int numero = 3;

        System.out.println("Ejecucion del bloque uno");

        //Evalua un valor
        switch (numero) { //Valor a evaluar

            case 1: //Casos
                System.out.println("Ejecucion del bloque valor 1");
                break;
            case 2:
                System.out.println("Ejecucion del bloque valor 2");
                break; //Para que corte y salga del case
            case 3:
                System.out.println("Ejecucion del bloque valor 3");
                break;
            case 4:
                System.out.println("Ejecucion del bloque valor 4");
                break;
            default:
                System.out.println("Ejecucion del bloque default");
                break;
        }

        System.out.println("Ejecucion del bloque dos (Salida)");
    }
}
