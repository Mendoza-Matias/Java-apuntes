
package practicas.excepciones.main.excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExcepcionControlada {
    public static void main(String[] args) {
        
        /*Java sabe que si no encuentra ese archivo nos va a dar un error.
        Entonces nos obliga a tener que implementar el try y el catch para capturar
        el error.*/
        try {
            FileReader archivo = new FileReader("archivo.txt"); //Vamos a leer un archivo para leerlo
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
