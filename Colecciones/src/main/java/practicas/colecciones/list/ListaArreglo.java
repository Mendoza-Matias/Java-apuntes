
package practicas.colecciones.list;

import java.util.ArrayList;


public class ListaArreglo {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(25);
        numeros.add(64);
        System.out.println("Tamaño de la lista " + numeros.size());
        //Comprobamos si existe un numero
        System.out.println(numeros.contains(20));
        
        //Obtener un numero
        System.out.println(numeros.get(2));
        
        //Modificar un elemento
        numeros.set(0, 12);
        
        //Eliminamos un elemento
        numeros.remove(3); //Podemos borrar por el indice o por el valor
        
        //Mostramos la lista
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("Tamaño de la lista " + numeros.size());
        
        
        
    }
}
