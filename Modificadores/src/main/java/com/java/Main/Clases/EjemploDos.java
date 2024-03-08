
package com.java.Main.Clases;

public class EjemploDos extends Ejemplo{
    /*Podemos acceder al atributo en la clase que lo hereda*/
    
    public void atributo(){
        atributoTres = 1; //Puedo acceder al atributo de la otra clase ya que lo hereda.
        
        /*Tiene acceso en otros paquetes si son subclases*/
    }
}
