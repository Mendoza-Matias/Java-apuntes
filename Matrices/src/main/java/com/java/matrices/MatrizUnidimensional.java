

package com.java.matrices;

public class MatrizUnidimensional {

    public static void main(String[] args) {
       /*Matrices unidimensionales
        
        Mis primeras matrices
        */
       
       int[] numeros = new int[10];
       
       //Accedemos a la matriz
       
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;
        numeros[6] = 70;
        numeros[7] = 80;
        numeros[8] = 90;
        numeros[9] = 100;
        
       //Mostramos los elementos de la matriz
       
        System.out.println("Lista numeros" + numeros[0]);
       
        System.out.println("---------Recorrer con un bucle-----------");
        //Recorrer con un bucle
        
        for(int i=0; i < numeros.length;i++){
            System.out.println("Valores" + numeros[i]);
        }
        
        /*Es mejor referenciar la condicion por el largo de la matriz,
        de esta manera evito que haya problemas si modifico el tamaño.*/
        
        
        //MATRIZ ASIGNANDO VALORES
        
        int[] numerosLista = {20,42,21,22,453,678,345}; //6
        
        System.out.println("Tamaño" + numerosLista.length);
    }
}
