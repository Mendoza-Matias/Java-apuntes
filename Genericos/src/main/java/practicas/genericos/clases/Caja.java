
package practicas.genericos.clases;

import practicas.genericos.intefaces.Volador;


public class Caja <T extends Animal & Volador>{

    /*T debe extendes de la clase animal y volador
    Restringe el tipo de objeto que puede contener
    Asegura que solo se puedan pasar tipos de clases
    que son animales y que puedan volar*/    
    private T contenido;
    
    //Constructor
    public Caja(T contenido){
        this.contenido = contenido;
    }
    
    /*Por que contenido es igual a T y este extiende de Animal y Volador
    Entonces tiene los metodos.*/
    public void realizarAcciones(){
        contenido.comer();
        contenido.volar();
    }
}
