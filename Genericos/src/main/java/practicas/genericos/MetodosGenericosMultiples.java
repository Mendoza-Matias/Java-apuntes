
package practicas.genericos;

import practicas.genericos.clases.Entidad;
import practicas.genericos.clases.PersonaDos;
import practicas.genericos.clases.Pes;
import practicas.genericos.clases.Rana;

public class MetodosGenericosMultiples {
    /*Interfaces Caminantes,Nadador y Saltador*/
    public static void main(String[] args) {
        
        Pes pes = new Pes();
        PersonaDos persona = new PersonaDos();
        Rana rana = new Rana();
        
        Entidad <PersonaDos> entidadPersona = new Entidad<>(persona);
        
        /*Aca lo que hago es crear un objeto de la clase entidad
        y le digo el tipo de dato que va a recibir*/
        Entidad <Rana> entidadRana = new Entidad<>(rana);
        
        entidadRana.realizarActividad(); /*Utilizo el metodo que llama a las
        implementaciones en la interfaz que esta clase esta implementando.
        De esta manera java entiende y diferencia entre cada uno de los 
        objetos*/
        
//        Entidad <Pes> entidadPes = new Entidad <>(pes); No nos deja porque tiene que implementar todas la interfaces
    }
}
