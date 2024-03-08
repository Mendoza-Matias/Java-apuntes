
package practicas.genericos.clases;

import java.util.List;

public class Utilidades {
    /*? De tipo comodin*/
    public static void imprimirLista(List<?>lista){
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
        /*El parametro es de tipo list es un comodin que permite que la lista
        sea de un valor desconocido , por lo que puede ser de cualquier tipo
        
        Los comodines solo se utilizan con listas*/
    }
}
