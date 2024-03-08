
package com.java.clases;

import com.java.clases.Galleta;

public class PrimerosObjetos {
    public static void main(String[] args) {
        /*Creando mis primeros objetos*/
        
        
        Galleta oreo = new Galleta();
        
        /*Estos no es lo mejor , se deben utilizar sus metodos*/
        oreo.forma = "Redonda";
        oreo.color = "Negro";
        oreo.sabor = "Chocolate";
        oreo.tipo = "Especial";
        
        
        System.out.println("Galleta" + oreo);
        
        /*Para acceder a cada atributo se deben utilizar sus metodos , estos atributos 
        deben ser privados o publicos en todo caso . Debemos tener en cuenta los modificadores de 
        acceso
        
        
        .Dato: cada objeto apunta a una ubicacion de memoria distinta
        
        
        New : Crea una direccion en memoria en donde se almacena el objeto.
        Ademas con ella podemos sobre escribir la creacion de un objeto y se asigna otra direccion en memoria.
        */
        
        
    }
}
