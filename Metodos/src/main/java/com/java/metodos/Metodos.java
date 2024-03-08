/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.metodos;

/**
 *
 * @author Matias
 */
public class Metodos {

    public static void main(String[] args) {
       
        Utilidades utilidades = new Utilidades(); //Nuevo objeto
        
        
        utilidades.saludar(); // utilizo el metodo al crear el objeto.

        double resultado = utilidades.sumarDosNumeros(20, 30);//Argumentos
    
        System.out.println("El resultado del metodo" + resultado);
        
        /*Ejemplo N°2 
        Si le agregamos el modificador static , ya no hace falta crear un objeto para llamar al metodo
        Sino que en este caso lo llamamos utilizando la clase directamente*/
        
        double resultadoDos = Utilidades.sumarDosNumeros(20, 20);
        
        System.out.println("Resultado del metodo directo de la clase " + resultadoDos);
        
        
        
        /*UTILIZANDO LOS METODOS SOBRE CARGADOS*/
        System.out.println("----------METODOS SOBRECARGADOS-------------------------------");
        int resultadoSobreCargado = utilidades.sumarNumeros(20, 30); //Devuelve un int recibe un int
        System.out.println("el resultado del metodo sobre cargado es : " + resultadoSobreCargado);
    
        int resultadoSobreCargadoDos = utilidades.sumarNumeros(20.22f, 50.22f); //Devuelve un int recibe floats
        System.out.println("El resultado del metodo sobrecargado dos es " + resultadoSobreCargadoDos);
        
        int resultadoSobreCargadoTres = utilidades.sumarNumeros("25", "35"); //Devuelve un int recibe un String
        System.out.println("El resultado del metodo sobrecargado tres es " + resultadoSobreCargadoTres);
        
    }
}
