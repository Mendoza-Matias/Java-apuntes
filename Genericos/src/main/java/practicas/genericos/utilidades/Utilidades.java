
package practicas.genericos.utilidades;


import java.util.Arrays;
import java.util.List;


public class Utilidades {
 
    
    //Metodos genericos 
    //Estatico ya que no crearemos objetos de la clase utilidades.
    public static <T> List <T> convertirArrayALista(T[] array){
        return Arrays.asList(array);
    }
    
    //Mas parametros genericos
    public static <T,G> List<T> arrayToList (T[]array,G[]arrayDos ){
    
        for (G elemento : arrayDos) {
            System.out.print( elemento+"");
        }
        return Arrays.asList(array);
    }
}
