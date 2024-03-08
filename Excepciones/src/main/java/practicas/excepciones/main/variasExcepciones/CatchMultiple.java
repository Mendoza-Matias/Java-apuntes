package practicas.excepciones.main.variasExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchMultiple {

    public static void main(String[] args) {

        /*No son expeciones controladas
        Por ejemplo dividir entre 0 o no insertar ningun dato
        Si declaro variables dentro del try solo existen dentro 
        de esta linea de codigo*/
        
        Scanner sc = new Scanner(System.in);

        int numUno;
        int numDos;
        int resultado;

        try{
        
        System.out.println("Introduce el numero uno");
        numUno = sc.nextInt();
        System.out.println("Introduce el numero dos");
        numDos = sc.nextInt();

        resultado = numUno / numDos;

        System.out.println("La división entre ambos numeros es " + resultado);

        //Captura el error relacionado a los inputs y el formato.
        }catch(InputMismatchException ex){//Si salta este no saltan los demas
            System.out.println("Formato incorrecto" + ex.getMessage());
        }catch(ArithmeticException ex2){ //Captura si se divide entre 0
            System.out.println("Division entre cero");
            ex2.printStackTrace();
        }catch(Exception e){
            System.out.println("Error desconocido");
            e.printStackTrace();
        }
        
    }
}
