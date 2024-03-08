

package practicas.genericos;

import java.util.List;
import practicas.genericos.clases.Casa;
import practicas.genericos.clases.Departamento;
import practicas.genericos.clases.Edificio;
import practicas.genericos.clases.Utilidades;


public class GenericosDos {
    /*Metodos comodines*/
    public static void main(String[] args) {
        List<String>listaString = List.of("Hola","que","tal");
        
        List<Integer>listaInteger = List.of(1,2,3,4,5);
        
        
        System.out.println("Lista de strings ");
        Utilidades.imprimirLista(listaString);
        
        System.out.println("---------------");
        System.out.println("Lista de numeros");
        Utilidades.imprimirLista(listaInteger);
        
        /*Con esto vemos como utilizar los comodines*/
        
        List<Edificio> listaEdificios = List.of(new Edificio("Edificio A"),
                new Casa("Cada 1"),
                new Departamento("Departamento Uno"));
        
        /*Espera un valor de tipoo casas*/
        List<Casa> listaCasas = List.of(new Casa("Casa dos"),
                new Casa("Casa tres"));
        
        Utilidades.imprimirLista(listaEdificios);
        
        Utilidades.imprimirLista(listaCasas);
    }
}
