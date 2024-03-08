
package practicas.colecciones.map;

import java.util.HashMap;
import java.util.Map;


public class MapaHash {
    public static void main(String[] args) {
        
        //Espera una clave y un valor
        HashMap<String,Integer> personas = new HashMap<>();
        
        personas.put("Pedro", 45);
        personas.put("Hugo", 22);
        personas.put("Pepe", 53);
        personas.put("Lucas", 20);
        
        //Acedemos a un valor usando la clave
        System.out.println("La edad de Pedro es :" + personas.get("Pedro"));
        
        //Verificar si una clave existe en la lista
        System.out.println("Pepe existe en la tabla " + personas.containsKey("Pepe"));
       
        
        //Acutalizamos un valor
        
        personas.put("Lucas", 45);
        
        
        //Eliminamos un valor
        personas.remove("Lucas");
        
         //Iterar
        for(Map.Entry<String,Integer> entry : personas.entrySet()){
            String nombre = entry.getKey();
            Integer edad = entry.getValue();
            System.out.println("Nombre " + nombre + " Edad : " + edad);
        }
        
    }
}
