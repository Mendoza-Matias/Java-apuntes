
package practicas.genericos.clasestres;

import practicas.genericos.intefaces.Contenedor;

/*Clase de tipo generica*/
public class MiClase <T> implements Contenedor<T>{

    T[] array;
    
    //Constructor generico.
    
    public MiClase(T[] array) {
        this.array = array;
       
    }

    @Override
    public boolean contenido(T objeto) {
    
        for (T elemento : array) {
            if(elemento.equals(objeto)){
                return true;
            }
        }
        return false;
    }
    
}
