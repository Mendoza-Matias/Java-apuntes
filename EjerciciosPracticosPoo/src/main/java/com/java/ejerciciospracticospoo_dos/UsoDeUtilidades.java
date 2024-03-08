
package com.java.ejerciciospracticospoo_dos;

public class UsoDeUtilidades {
    
    public static void main(String[] args) {
        
        
        
        Utilidades calcularPrecio = new Utilidades();
        
        /*Tambien es posible separarlo a cada una de las etapas en variables*/
        System.out.println(calcularPrecio.mostrarResultadoFinal(calcularPrecio.aplicarIva(calcularPrecio.ingresaUnNumero())));
    }
}
