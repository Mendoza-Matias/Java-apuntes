
package com.java.bucles;

public class DoWhile {
    public static void main(String[] args) {
    /*Do while : ejecuta la sentencia al menos una vez y luego de eso comprueba la 
    condicion
    Si es verdadera vuelve a repetir la sentencia , si es falsa sale*/
    
    
        System.out.println("Inicio de la ejecucion");
    
        int contador = 0;
        
        do{
            System.out.println("Primer ejecucion" + contador);
            contador++;
        }while(contador <= 1);
        
        System.out.println("Final de la ejecucion" + contador);
    }
  
}
