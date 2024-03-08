
package practicas.colecciones.set;

import java.util.TreeSet;



public class SegundaColeccionSet {
    public static void main(String[] args) {
        
        /*TreeSet*/
        
        TreeSet<String>paises = new TreeSet<>();
        
        //Insertamos un elemento 
        paises.add("Italia");
        paises.add("Alemania");
        paises.add("Noruega");
        paises.add("Irlanda");
        paises.add("Nueva Zelanda");
        
        /*Ordena segun el natural
        No admite duplicados
        No admite un null*/
        
        System.out.println("Paises");
        System.out.print(paises);
        
        //Buscamos un pais
        System.out.println(" ");
        System.out.println(paises.contains("Italia"));
        
        //Borramos un elemento
        paises.remove("Nueva Zelanda");
        System.out.println("Paises");
        System.out.print(paises);
     
        
      
    }
}
