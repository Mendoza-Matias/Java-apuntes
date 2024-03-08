package practicas.colecciones.list;

import java.util.LinkedList;

public class ListaLinked {

    public static void main(String[] args) {
        /*LinkedList*/

        //Creamos
        LinkedList<String> colores = new LinkedList<>();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Violeta");

        //Agregamos un elemento al principio
        colores.addFirst("Negro");

        //Agregamos un elemento al final 
        colores.addLast("Amarillo");

        //Agregamos un elemento en una posicion especifica
        colores.add(1, "Plata");

        System.out.println(colores);

        String primerElemento = colores.getFirst();
        String ultimoElemento = colores.getLast();

        System.out.println("Primer elemento " + primerElemento);
        System.out.println("Ultimo elemento " + ultimoElemento);

        if (colores.contains("Azul")) {
            //Index of obtiene el indice del elemento
            colores.remove(colores.indexOf("Azul"));
        }

        String ultimoElementoEliminado = colores.removeLast();

        System.out.println("Ultimo eliminado " + ultimoElementoEliminado);

        
        //Borramos todo
        
        colores.clear();
        
        System.out.println(colores);
    }
}
