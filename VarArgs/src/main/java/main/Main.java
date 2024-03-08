
package main;

import utils.Utilidades;


public class Main {
    public static void main(String[] args) {
        
        Utilidades utilidades = new Utilidades();
        
        utilidades.calcular(1,2,3,4,5); //Pasamos multiples argumentos en el metodo de longitud variable
        
        
        //------Segundo ejemplo
        
        utilidades.calcularDos(20, 50, 5,5);
    }
}
