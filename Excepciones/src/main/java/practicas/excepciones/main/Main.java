/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practicas.excepciones.main;

/**
 *
 * @author leona
 */
public class Main {

    public static void main(String[] args) {
        
        try{
            int i = Integer.parseInt("x"); //Si hay error esto no se ejecuta
            System.out.println("Hola desde try");
        
        }catch(Exception e){
            //getMessage para obtener el mensaje de error
            System.out.println("Error en el try , se activa el catch");
        }finally{//Esta linea es opcional
            //Depende del objetivo de nuestro programa.
            System.out.println("Me ejecuto siempre");
        }
    }
}
