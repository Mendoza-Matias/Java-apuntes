
package practicas.genericos;

import practicas.genericos.clases.Ave;
import practicas.genericos.clases.Caja;
import practicas.genericos.clases.Murcielago;

public class GenericosConLimiteDos {
    /*Uso de clases limitadas mas restrictivo*/
    
    public static void main(String[] args) {
        
        Ave ave = new Ave();
        Murcielago murcielago = new Murcielago();
        
        /*Acepta implementaciones de solo el tipo ave
        No se pueden mezclar los tipos
        Que extiendan de animal y que sea de la calse Ave
        
        De esta manera restringimos los tipos*/
        Caja<Ave> cajaAve = new Caja<>(ave);
        cajaAve.realizarAcciones();
    }
}
