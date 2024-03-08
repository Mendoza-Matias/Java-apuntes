
package Main;

import Clases.Profesor;
import Clases.ProfesorInterno;


public class Main {
    public static void main(String[] args) {
        /*Casting superior*/
        
        ProfesorInterno pInterno = new ProfesorInterno(10);
        Profesor p1 = new Profesor("Profesor Ingles");
        
        p1 = pInterno; //Conversion hacia arriba
//        System.out.println(p1.get); //Se pierden ciertos datos


    //Casting hacia abajo.
    
        /*No se puede hacer la inversa de manera explicita , se debe hacer de manera implicita*/
        
        Profesor p2;
        
        ProfesorInterno pInterno2 = new ProfesorInterno(10,"Profesor Musica","123");
        p2 = pInterno2;
        
        pInterno2 = (ProfesorInterno) p2; //Realizo el casting
        //En este caso no se pierden datos.
    }
}
