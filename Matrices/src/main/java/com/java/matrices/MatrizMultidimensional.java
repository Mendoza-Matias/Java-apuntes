/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.matrices;

/**
 *
 * @author Matias
 */
public class MatrizMultidimensional {
    
    public static void main(String[] args) {
        
        //Creamos una matriz bidimensional
        int[][] miMatriz = new int[3][5]; //new int[fila][columna]

        //Llenar la matriz
        miMatriz[0][0] = 1;
        miMatriz[0][1] = 2;
        miMatriz[0][2] = 5;
        miMatriz[0][3] = 6;
        miMatriz[0][4] = 12;
        
        miMatriz[1][0] = 214;
        miMatriz[1][1] = 32;
        miMatriz[1][2] = 54;
        miMatriz[1][3] = 85;
        miMatriz[1][4] = 13;
        
        for(int i =0 ; i<miMatriz.length;i++){
            //Recorre las filas
            System.out.println(" ");
            for (int j = 0; j < miMatriz.length; j++) { //Recorre las columnas
                System.out.print(miMatriz[i][j]+" ");
            }
        }
    }
}
