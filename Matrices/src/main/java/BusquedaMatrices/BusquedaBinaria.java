/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusquedaMatrices;

/**
 *
 * @author Matias
 */
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    
        System.out.println(busquedaBinaria(numeros, 5));
    }
    
    public static int busquedaBinaria(int[]matriz,int numeroBuscar){
        int inicio = 0;
        int fin = matriz.length -1; //El elemento final de la matriz indice
        
        while(inicio <= fin){
            
            int medio = (inicio + fin) / 2; //Divido la matriz en dos partes
            
            if(matriz[medio] == numeroBuscar){
                return medio;
            }else if (matriz[medio] < numeroBuscar){
                inicio = medio+1;
            }else{
                fin = medio -1;
            }
        }
        return -1;
    }
}
