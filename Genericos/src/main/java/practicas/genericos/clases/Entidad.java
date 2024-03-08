
package practicas.genericos.clases;

import practicas.genericos.intefaces.Caminante;
import practicas.genericos.intefaces.Nadador;
import practicas.genericos.intefaces.Saltador;

/*Extiende de las interfaces Nadador , saltador , caminante
Solo aceptara entidades que implementen de estas interfaces 
Parametro con limitacion

La primera de todas es una clase y demas interfaces 
o todas interfaces

Osea puedo condicionarlo tambien con la clase.*/
public class Entidad <T extends Nadador & Saltador & Caminante>{
    
    private T entidad;

    public Entidad(T entidad) {
        this.entidad = entidad;
    }
    
    //Esta entidad va a llamar a multiples metodos
    public void realizarActividad(){
        entidad.caminar();
        entidad.nadar();
        entidad.saltar();
    }
}
