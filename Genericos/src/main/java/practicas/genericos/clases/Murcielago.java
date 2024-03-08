
package practicas.genericos.clases;

import practicas.genericos.intefaces.Volador;

public class Murcielago extends Animal implements Volador{

    @Override
    public void volar() {
        System.out.println("El murcielago esta volando");
    }
    
}
