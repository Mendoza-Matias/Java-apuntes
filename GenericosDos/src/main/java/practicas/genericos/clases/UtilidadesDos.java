
package practicas.genericos.clases;

import java.util.List;
import practicas.genericos.clases.Imprimibles;

public class UtilidadesDos {
      /*La T porque es un generico
    Para ser utilidaza debe implementar la interfaz imprimible
    
    Si extiende la clase de otra que implementa esta interfaz , automaticamente
    esta tambien lo hara.*/
    public static <T extends Imprimibles > void imprimirElementos(List<T>lista){
        for (T elemento : lista) {
            elemento.imprimir();
        }
    }
}
