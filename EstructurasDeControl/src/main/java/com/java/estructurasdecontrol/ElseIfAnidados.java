
package com.java.estructurasdecontrol;
public class ElseIfAnidados {
    
    public static void main(String[] args) {
        
        /*Ejemplo de if else anidados
        
        Podemos utilizar tambien operadores logicos
        Si da verdadero en alguno de las sentencias , ejecuta 
        todo lo que esta dentro y lo demas lo pasa de largo.
        */
        
        int numero = 2;
        
        System.out.println("Ejecucion bloque uno");
        
        if(numero == 1){
            
            System.out.println("Ejecucion bloque dos");
        
        }else if(numero == 2){
        
            System.out.println("Ejecucion bloque tres");
        
        }else if(numero == 3){
            
            System.out.println("Ejecucion bloque cuatro");
        
        }else{
        
            System.out.println("Ejecucion bloque cinco");
        }
        
        System.out.println("Ejecucion bloque seis (Ninguna condicion)");
        
        
        
    }
}
