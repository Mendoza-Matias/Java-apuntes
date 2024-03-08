/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.matrices.metodos;

/**
 *
 * @author Matias
 */
public class OrdenacionBurbuja {

    public static void main(String[] args) {

        int[] miMatriz = {20, 40, 21, 54, 23, 53};

        for (int valor : miMatriz) {
            System.out.print(valor + " ");
        }

        System.out.println("Matriz ordenada");
        System.out.print("");
        metodoBurbuja(miMatriz);
        
        for (int valor : miMatriz) {
            System.out.print(valor + " ");
        }
    }

    public static void metodoBurbuja(int[] matriz) { //No requiere de objetos para funcionar
        int aux;
        //Primer bucle encargado de las pasadas
        //valor/posicion Actual ) con el valor o la posicion de la derecha
        for (int i = 0; i < matriz.length; i++) {
            //Empezamos en a=1 para que este en el lugar de la derecha , para comparar con el actual
            for (int a = 1; a < matriz.length; a++) {
                //Hacemos la comparacion si el de la derecha es menor que el valor de a-1
                if (matriz[a] < matriz[a - 1]) {
                    aux = matriz[a]; //Le asignamos el valor a la posicion derecha
                    matriz[a] = matriz[a-1]; //asignamos el valor de la izquierda a la posicion derecha
                    matriz[a-1] = aux; //Le asignamos el valor de auxiliar a la derecha
                }
            }
        }
    }

}
