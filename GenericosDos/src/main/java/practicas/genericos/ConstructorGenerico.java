
package practicas.genericos;

import practicas.genericos.clases.MiClase;
import practicas.genericos.clases.SumaN;


public class ConstructorGenerico {
    public static void main(String[] args) {
        
        /*Acepta cualquier tipo de numerico.*/
        SumaN suma = new SumaN(5.50);
        System.out.println(suma.getSuma());
        
        /*Diferencia entre cada tipo de dato.*/
        
        MiClase<String> instancia1 = new MiClase<>("Hola");
        System.out.println("valor de la instancia " + instancia1.getValor());
        
        MiClase<Integer> instancia2 = new MiClase<>(12345);
        System.out.println("valor de la instancia dos " + instancia2.getValor());
    }
}
