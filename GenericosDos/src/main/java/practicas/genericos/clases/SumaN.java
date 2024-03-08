
package practicas.genericos.clases;


public class SumaN {
    private int suma;
    
    //Constructor generico
    /*El limite de este generico es un Number (valor numerico)*/
    public <T extends Number> SumaN(T numero) {
        suma = 0;
        //Convertimos el valor a un tipo entero
        for (int i = 0; i <= numero.intValue() ; i++) {
            suma += i;
        }
    }

    public int getSuma() {
        return suma;
    }
    
    
    
}
