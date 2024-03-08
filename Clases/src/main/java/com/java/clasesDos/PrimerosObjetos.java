
package com.java.clasesDos;

public class PrimerosObjetos {
    public static void main(String[] args) {
        /*Creacion del objeto y asignacion de valores mediante sus metodos 
        
        FORMA RECOMENDADA Y ACORDE 
        No es bueno hacerlo como lo realizamos en las clases del paquete com.java.clases*/
        
        Galleta galletaChips = new Galleta();
        
        galletaChips.setTipo("Chocolate"); //Argumento del setter
        
        System.out.println("El tipo de la galleta es : " + galletaChips.getTipo());
    }
}
