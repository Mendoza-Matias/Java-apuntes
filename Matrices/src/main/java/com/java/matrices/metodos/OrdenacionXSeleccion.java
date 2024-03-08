
package com.java.matrices.metodos;

public class OrdenacionXSeleccion {
    public static void main(String[] args) {
        
        int[] numeros = {8,2,3,4,5,1};
        
        System.out.println("Matriz sin ordenar");
        
        for (int numero : numeros) {
            System.out.print(numero+"");
        }
        
        ordenacionSeleccion(numeros);
        
        System.out.println(" ");
        System.out.println("Matriz ordenada");
        
        for (int numero : numeros) {
            System.out.print(numero +" ");
        }
    }
    
    public static void ordenacionSeleccion(int[]matriz){
        //El primer bucle empieza del primer elemento hasta el penultimo elemento
        for (int i = 0; i < matriz.length -1 ; i++) {
            //El segundo for se utiliza para buscar el elemento mas pequeño de la seleccion desordenada.
            for (int j = i + 1 ; j < matriz.length; j++) {
                //Empieza en i + 1 para poder obtener el valor de la derecha , osea el siguiente elemento.
                
                if(matriz[i] > matriz[j]){
                //Si el elemento actual es menor al elemento anterior
                //Se guarda dentro del auxiliar , el elemento mas pequeño
                
                int aux = matriz[i];
                
                //Intercambiamos los valores de sitio
                
                matriz[i] = matriz[j];
                matriz[j] = aux;
                }
            }
        }
        
    }
}
