
package com.java.operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        /*
        Operadores Unarios 
        Son aquellos que solo requieren de un operador para funcionar 
        + Suma (numeros positivos)
        - Resta (numeros negativos)
        ! Negacion
        ++ Incremento + 1
        -- Decremento -1
        */
        
        int resultado = 2;
        
        int resultadoDos = +2;
        
        int resultadoTres = -2;
        
        System.out.println(resultado);
        System.out.println(resultadoDos);
        System.out.println(resultadoTres);
        
        /*Operador de incremento*/
        
        resultado ++;
        
        System.out.println(resultado);
        
        /*Operador de incremento*/
        
        resultado --;
        
        System.out.println(resultado);
        
        /*Pasar el resultado a negativo*/
        
        resultado = -resultado;
        
        System.out.println(resultado);
        
        
        /*Operador de negacion*/
        
        boolean verdadero = true;
        
        System.out.println(!verdadero); //Cambia el valor del operador
        
        
        /*Si coloco el ++ delante de la variable , primero lo incrementa y luego lo asigna
        Si cololo detras , primero le asigno el valor actual y luego lo incremento en uno*/
        
        
        //------------------------------------------------
       
        /*Operadores aritmeticos combinados
        
        += Suma combinada (Realiza la suma y despues hace la asignacion)
        -= Resta combinada
        *= Multiplicacion combinada 
        /= Division combinada 
        %= Modulo combinado
        */
        
        int num1 = 20;
        int num2 = 20;
        
//        num1 += num2;  40
//        num1 -= num2;
          num1 *= num2;
          
        System.out.println(num1);
              
    }
}
