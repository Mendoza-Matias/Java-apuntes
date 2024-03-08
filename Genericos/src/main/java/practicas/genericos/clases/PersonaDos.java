
package practicas.genericos.clases;

import practicas.genericos.intefaces.Caminante;
import practicas.genericos.intefaces.Nadador;
import practicas.genericos.intefaces.Saltador;

/*Implementamos multiples interfaces.*/
public class PersonaDos implements Saltador,Nadador,Caminante {

    @Override
    public void saltar() {
        System.out.println("La persona esta salta");
    }

    @Override
    public void nadar() {
        System.out.println("La persona esta nadando");
    }

    @Override
    public void caminar() {
        System.out.println("La persona esta caminando");
    }
    
}
