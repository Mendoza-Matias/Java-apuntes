
package com.java.Main.Static;


public class Persona {
    //Atributos / variables
    
    public static int edad;
    public static String nombre; 
    public static int NUMERO = 1000; //Valor variable
    public static int A;
    public static int B;
    
    /*Se suele utilizar con las constantes . igual es recomendable hacerlo 
    mediante un constructor.
    
    Podemos acceder a las variables desde cualquier sitio*/
    
    //Metodos
    
    public static int division(){ //Retorna la mitad de mil
        return NUMERO / 2;
    }
    
    //Bloque estatico (Se ejecuta antes de todo)
    
    static{
        A = 2;
        B = 3;
    }
}
