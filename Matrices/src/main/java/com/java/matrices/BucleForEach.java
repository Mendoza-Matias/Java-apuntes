
package com.java.matrices;

public class BucleForEach {
    public static void main(String[] args) {
        /*USO DEL BUCLE FOR EACH*/
        
        //DECLARO LA MATRIZ
        int[]numeros = new int[10];
         
        //RELLENO LA MATRIZ
        for(int i=0;i<numeros.length;i++){
            numeros[i] = i;
        }
        
        //RECORRO LA MATRIZ Y EXTRAIGO SUS VALORES (ForEach)
        for(int numero:numeros){
            System.out.println("Los valores del array son : " + numero);
        }
        
    }
}
