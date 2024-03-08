package practicas.colecciones.map;

import java.util.Map;
import java.util.TreeMap;

public class ArbolMap {

    public static void main(String[] args) {

        //Creamos un TreeMap
        Map<Integer, String> frutas = new TreeMap<>();

        //añadimos valores
        frutas.put(1, "Banana");
        frutas.put(2, "Anana");
        frutas.put(3, "Pera");
        frutas.put(4, "Manzana");
        frutas.put(5, "Arandanos");
        
        //Accedemos al valor de una posiciones.
        System.out.println(frutas.get(4));
        
        //Verificamos si una clave existe
        System.out.println("Existe la key 2 " + frutas.containsKey(3));
        
        //Verificar si existe el valor 
        System.out.println("Existe la manzana " + frutas.containsValue("Manzana"));
        
        //Actualizamos un valor
        frutas.put(5, "Limon");
        
        frutas.remove(4);
        
        frutas.clear();
        
        //Iteracion
        for(Map.Entry<Integer,String> entry : frutas.entrySet()){
            Integer clave = entry.getKey();
            String nombre = entry.getValue();
            
            System.out.println("El nombre es " + nombre + " su clave es : " + clave);
        }
        
        System.out.println("Esta vacio " + frutas.isEmpty());
    }
}
