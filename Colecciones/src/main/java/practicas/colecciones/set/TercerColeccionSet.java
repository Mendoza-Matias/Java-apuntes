package practicas.colecciones.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class TercerColeccionSet {

    public static void main(String[] args) {
        /*LinkedHashSet
        
        Mantiene el orden de inserción
        
        No permite duplicados.*/
        
        Scanner sc = new Scanner(System.in);
        String texto;
        
        LinkedHashSet<String> coleccion = new LinkedHashSet<>();

        coleccion.add("Juan");
        coleccion.add("Roberto");
        coleccion.add("Pedro");
        coleccion.add("Leo");

        System.out.println(coleccion);

        //Borramos un elemento
        coleccion.remove("Juan");

        System.out.println(coleccion);
        
        System.out.println("Inserta un nombre");
        texto = sc.next();
        
        String[] palabras = texto.split(" "); //Formato a guardar
        
        /*La matriz de palabras nos devuelve una lista y la pasamos directamente
        en el constructor*/
        LinkedHashSet<String> palabraUnicas = new LinkedHashSet<>(Arrays.asList(palabras));
    
        System.out.println("Palabras unicas en orden alfabetico");
        
        for (String palabraUnica : palabraUnicas) {
            System.out.print(palabraUnica + " ");
        }
    }
}
