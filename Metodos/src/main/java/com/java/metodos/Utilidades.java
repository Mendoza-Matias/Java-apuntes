/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.metodos;

/**
 *
 * @author Matias
 */
public class Utilidades {
     //ATRIBUTOS
    
    
    
    //CONSTRUCTOR
    
    
    
    //METODOS
     /*Creacion de un metodo
        
       void : sin retorno*/
    
    public void saludar(){
            
        System.out.println("Hola desde un metodo");
    }
    
    
    /*Utilizacion de metodos con parametros*/
    public static double sumarDosNumeros(int num1, int num2){
        /*Variables locales al metodo*/
        double resultado;
        resultado = (num1 + num2);
        
        return resultado; //Retorna el resultado de la operacion
    }
    
    /*Sobrecarga de metodos:
    Metodos con el mismo nombre pero que reciben de parametros distintos.
    */
    
    public int sumarNumeros(int numeroUno,int numeroDos){
        int resultado;
        resultado = numeroUno + numeroDos;
        
        return resultado;
    }
    
    public int sumarNumeros(String numeroUno, String numeroDos) {
        int resultado;
        
        resultado =  Integer.parseInt(numeroUno) + Integer.parseInt(numeroDos);

        return resultado;
    }
    
    public int sumarNumeros(float numeroUno , float numeroDos){
        int resultado;
       
        resultado = (int)numeroUno + (int)numeroDos; //Casting
        
        return resultado;
    }
    
}
