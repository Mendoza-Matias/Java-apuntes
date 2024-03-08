
package com.java.estructurasdecontrol;



public class OperadorTernario {
    
    public static void main(String[] args) {
        
        /*Operador ternario.
        Devuelve un valor si la condicion se cumple
        
        Condicion ? operacion true : operacion false
        
        */
        int numUno = 10;
        int numDos = 20;
        int numMayor;
     
        numMayor = numUno < numDos ? numUno:numDos;
        
        
        System.out.println(numMayor);
        
        
    }
    
}
