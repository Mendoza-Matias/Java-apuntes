
package com.java.bloqueanonimo.clases;


public class Galleta {
    private final int idGalleta;
    private static int contadorGalleta;
    
    public Galleta(){
        
    }
    
    /*Estos bloques sirven para la inicializacion de variables
    metodos , de caracteristicas de una clase o de un objeto
    Se ejecutan antes del constructor 
    
    Se ejecuta una unica vez cada bloque
    Inicializar variables o atributos para que se carguen antes de cualquier componente.
    
    ---> No es muy comun encontrarlo. <---
    
    */
    //Bloque anonimo de tipo estatico
    
    static{
        System.out.println("Ejecucion del bloque estatico");
        ++Galleta.contadorGalleta;
        //this no se puede referenciar en un contexto estatico.
    }
    
    //Bloque anonimo dinamico o normal (estaticas,podemos llamarlas)
    {
        System.out.println("Ejecucion del bloque normal");
        this.idGalleta = contadorGalleta++;
    }

    public int getIdGalleta() {
        return idGalleta;
    }
    
    
    
    
}
