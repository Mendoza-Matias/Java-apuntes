
package practicas.genericos.clases;

import practicas.genericos.intefaces.Caminante;
import practicas.genericos.intefaces.Nadador;
import practicas.genericos.intefaces.Saltador;

public class Rana implements Caminante , Nadador , Saltador{
    @Override
    public void saltar() {
        System.out.println("La Rana esta salta");
    }

    @Override
    public void nadar() {
        System.out.println("La Rana esta nadando");
    }

    @Override
    public void caminar() {
        System.out.println("La Rana esta caminando");
    }
}
