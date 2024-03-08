
package Main;

import Clases.MetodosEnums;




public class ProbandoMetodos {
    public static void main(String[] args) {
        /*Probando algunos metodos pertenecientes a la clase enum*/
        
        //Creo una matriz
        MetodosEnums[] deportes = MetodosEnums.values(); //Me devuelve una matriz con todos los tipos. 
        
        //Tipo[] nombre matriz = valores a guardar
        
        
        //Mostramos las enums y sus valores ordinales
        for (MetodosEnums deporte : deportes) {
            System.out.println(deporte + " y su indice es : " + deporte.ordinal());
        }
        
        /*Con el metodo ordinal obtengo el indice del elemento.*/
        
        //------------------
        
        MetodosEnums c1 = MetodosEnums.BASKETBALL;
        MetodosEnums c2 = MetodosEnums.FUTBOL;
        MetodosEnums c3 = MetodosEnums.RUGBY;
        
        //Para comparar mediante una condicion , podemos usar el compareTo(enum a comparar)
    }
}
