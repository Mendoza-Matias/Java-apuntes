package practicas.colecciones.set;

import java.util.HashSet;
import practicas.colecciones.clases.Persona;

public class PrimerColeccionSet {

    public static void main(String[] args) {
        /*HashSet*/

        //Creacion
        HashSet<String> paises = new HashSet<>();

        //Insertando valores
        paises.add("Argentina");
        paises.add("Brasil");
        paises.add("Uruguay");
        paises.add("Peru");
        paises.add("Colombia");
        paises.add("Chile");

        //Buscamos un elemento especifico
        System.out.println(paises.contains("Argentina")); //Devuelve true o false

        //Eliminamos un elemento del HashSet
        paises.remove("Argentina");

        System.out.println(paises);
        //La podemos recorrer mediante un bucle

        //Iteramos la coleccion
        for (String pais : paises) {
            System.out.print(pais + " ");
        }

        System.out.println(" ");
        //Creando un HashSet de objetos
        //Le paso el tipo de objeto que quiero guardar.
        HashSet<Persona> personas = new HashSet<>();

        //Tenemos que pasarle el metodo toString para mostrar los datos
        //Sino nos mostrara nomas la representación del objeto en memoria.
        personas.add(new Persona("Matias", "Mendoza", 20, "44547239"));
        personas.add(new Persona("Juan", "Perez", 44, "4432242"));
        personas.add(new Persona("Pedro", "Lopez", 55, "5543213"));
        
        
        
        
        for (Persona persona : personas) {
            
            System.out.println(persona);
        }
    }
}
