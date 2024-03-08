package com.java.conversiones;
public class Conversiones {

    public static void main(String[] args) {
        /*Conversiones de tipo de dato
        Casting :
        Este puede ser de tipo explicito (Manual) 
        o implicito (Automatico).
        
        Los tipos de datos al ingresar por teclado vienen en formato 
        texto, por ende debemos hacer una conversion y de esta manera trabajar
        con ellos
        */
        
        //------------------------------------------------------
        /*String a tipos primitivos
        valueOf(String) devuelve un nuevo objeto Integer() 
        mientras que parseInt(String) devuelve un int primitivo.
        */
        
        //Declaracion
        
        String nombre = "Matias";
        String numero = "10";
        
        char caracter = nombre.charAt(0);
        
        int numeroDos = Integer.parseInt(numero); //Metodos 
        
        System.out.println(numeroDos);
        
        System.out.println(caracter);
        
        
    }
}
