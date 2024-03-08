
package practicas.colecciones.map;

import java.util.LinkedHashMap;
import java.util.Map;


public class ListaLinkedHashMap {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer,String> paises = new LinkedHashMap<>();
        
        
        paises.put(001, "Argentina");
        paises.put(002, "Brazil");
        paises.put(003, "Peru");
        
        paises.put(004, "Chile");
        
        /*Si insertamos un dato dos veces se sobre escribe*/
        for(Map.Entry<Integer,String> entry : paises.entrySet()){
            
            System.out.println("Paises " + entry.getValue());
        }
        
        
    }
}
