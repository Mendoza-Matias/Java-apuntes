
package com.java.operadores;

/**
 *
 * @author Matias
 */
public class OperadoresRelacionales {
    public static void main (String[]args){
    
    /*Operadores relacionales 
    Sirven para realizar comparaciones entre datos compatibles de tipo primitivo
    teniendo siempre el resultado booleando.
    
    == igual que
    != distinto que 
    < menor
    > mayor 
    >= mayor igual
    <= menor igual   
    */
    
    //Declaracion de variables
    
    int num1 = 20;
    int num2 = 50;
    
    boolean resultado;
    
//    resultado = num1 == num2; //False
    
//    System.out.println(num1 != num2); //True
    
//    System.out.println(num1 < num2); //True
    
//    System.out.println(num1 > num2); //false
    
     System.out.println(num1 >= num2); //False (se cumple alguna de las dos condiciones)
     
     System.out.println(num1 <= num2); //True
     
     
     /*-------------------------------------------------*/
     
     /*Operador logico :
      && Y And (ambos deben tener true para ser true)
      ! Negacion logica 
     */
     
     /*-------------------------------------------------*/
     
     /*Operador ternario
     Simplificacion de la declararacion if else
     Declaracion:
     
     */
     
     int num3 = 20;
     int num4 = 25;
     
     int resultado2 =(num3 > num4 )?num3 : num4; 
     
        System.out.println(resultado2);
     
    }
}
