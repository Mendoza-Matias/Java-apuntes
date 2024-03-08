/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.matrices.metodos;

/**
 *
 * @author Matias
 */
public class OrdenamientoXInsercion {
    public static void main(String[] args) {
        
        int[] numeros = {5,3,4,1,2};
        
        System.out.println("Matriz sin ordenar");
        
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println("");
        
        ordenacionInsercion(numeros);
        
        System.out.println("Matriz ordenada");
    
         for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
    
    public static void ordenacionInsercion(int[]matriz){
       
        
        //Empezamos con pasada en 1 ya que el primer elemento se considera ordenado por defecto
        
        for(int pasada = 1; pasada<matriz.length; pasada++){
            //El elemento no clasificado se guarda en la variable , osea el elemento actual 
            int aux = matriz[pasada];
            
            int posicionAnterior = pasada - 1; //Obtenemos el valor y le restamos 1 para obtener la posicion inicial 
            
            //Bucle , while se encarga de desplazar los elementos de la seleccion ordenada
            //Que son mayores que el elemento seleccionado (variable aux)
            while((posicionAnterior > -1)&&(matriz[posicionAnterior]>aux)){
                //Si la posicion actual es mayor que -1
                //Y si el numero de la matriz en la posicion anterior,
                //es que sea mayor que el elemento sin clasificar de la variable aux
                
                matriz[posicionAnterior + 1] = matriz[posicionAnterior];
                
                posicionAnterior--; //Restamos menos uno para volver a la posicion anterior.
            }
            matriz[posicionAnterior + 1] = aux;
            posicionAnterior--;
        }
    }
}
