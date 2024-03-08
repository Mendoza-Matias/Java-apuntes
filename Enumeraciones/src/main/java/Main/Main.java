
package Main;

import Clases.Enumeracion;

public class Main {
    public static void main(String[] args) {
        
        //-------------INTRODUCCION---------
        
//        Enumeracion c1 = Enumeracion.ROJO; //Utilizo la clase.
//        System.out.println(c1);//Imprime el valor Rojo
        
        //---------EJEMPLO-------------/
        
        Enumeracion c = Enumeracion.COCHE;
        
        //Me devuelve segun el valor que es (Con if)
        if(c == Enumeracion.COCHE){
            System.out.println("Es un coche");
        }else if(c == Enumeracion.AVION){
            System.out.println("Esto es un avion");
        }else if(c == Enumeracion.CAMION){
            System.out.println("Es un camion");
        }else{
            System.out.println("Opcion no existente");
        }
        
        /*Los enums son similares a las constantes.*/
        
        switch (c) {
            case CAMION: //No hace falta poner Enumeracion.CAMION 
                System.out.println("Es un camion");
                break;
            default:
                System.out.println("Elige una opcion valida");;
        }
        
    }
}
