package practicas.genericos;

import java.util.List;
import practicas.genericos.clases.Persona;
import practicas.genericos.utilidades.Utilidades;

public class Genericos {

    public static void main(String[] args) {

        Persona[] arrayPersonas = {
            new Persona("Matias"),
            new Persona("Juan"),
            new Persona("Roberto"),
            new Persona("Leonardo")
        };

        /*El metodo es generico y lo que hace es convertir el array en 
        una lista , pero lo importante es que no fue necesario sobre escribir
        o realizar conversiones en tipos de datos.*/
        List<Persona> listasPersonas = Utilidades.convertirArrayALista(arrayPersonas);

        for (Persona listasPersona : listasPersonas) {
            System.out.print(listasPersona + " ");
        }
    }
}
