/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.operadores;

/**
 *
 * @author Matias
 */
public class Operadores {

    public static void main(String[] args) {
        /*
        Operador de asignacion : = sirve para asignar un valor
         */

        int edadDos;
        /*Asignacion del valor*/
        edadDos = 20;

        /*
        Operador Aritmetico : = sirve para realizar operaciones entre variables.
        
        Suma = +                   
        Resta = -                 
        Multiplicacion = *         
        Division = /               
        Modulo = % (Resto)          
                                                      
         */
        //Declaracion de variables
        int numeroUno = 20;
        int numeroDos = 20;

        int resultado = numeroUno + numeroDos;

        resultado = numeroUno - numeroDos;

        resultado = numeroUno * numeroDos;

        resultado = numeroUno / numeroDos;

        resultado = numeroUno % numeroDos;

        /*
        El resultado es de tipo Long si , al menos uno de los operadores es de tipo
        long y ninguno es real (float o double)
         */
//        long numTres = 101;
//        int numCuatro = 5;
//        
//        long resultadoDos = numTres + numCuatro;
        //----------------------------------------
        /*
        El resultado es de tipo int si ninguno de los operadores es de tipo long y tampoco
        real (float , double)
         */
        int numCuatro = 50;
        int numCinco = 50;

        int resultadoTres = numCuatro + numCinco;

        //----------------------------------------
        /*
        El resultado es de tipo double si al menos uno de los operandos es de tipo 
        double y entonces la variable resultado debe ser de tipo double.
         */
//        int numSeis = 20;
//        double numSiete = 20.5d;
//        
//        double resultadoCuatro = numSeis + numSiete;
        //----------------------------------------
        /*
        El resultado es de tipo float si al menos uno de los operandos es de tipo 
        float y entonces la variable resultado debe ser de tipo double.
         */
        int numSeis = 20;
        float numSiete = 20.5f;
        
        float resultadoCuatro = numSeis + numSiete;
        
         //----------------------------------------
        /*
        El resultado de la division entre cero gera una excepcion , es resultado
         valido.*/
    }
}
