
package practicas.genericos.clases;

import practicas.genericos.intefaces.Volador;

public class Ave extends Animal implements Volador{

    //Implemento el metodo
    @Override
    public void volar() {
        System.out.println("El ave esta volando");
    }
    
}
