/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.java.constructor;

/**
 *
 * @author Matias
 */
public class Constructor {

    public static void main(String[] args) {
        /*Creando un objeto*/
        
        //ASIGNANDO VALORES DE MANERA DIRECTA EN LOS ATRIBUTOS
        Persona personaUno = new Persona("Matias","Mendoza",20); /*[Nombre clase][Nombre objeto]=[Inicializacion]();*/
        System.out.println("Persona uno " + personaUno.toString());
        
        /*ASIGNANDO VALORES CON GETTERS Y SETTERS EN LOS ATRIBUTOS*/
        Persona personaDos = new Persona();
        
        personaDos.setNombre("Juan");
        personaDos.setApellido("Lobo");
        personaDos.setEdad(42);
        
        System.out.println("Persona dos " + personaDos.toString());
        
        /*SOBRE CARGA DE CONSTRUCTORES*/
        Persona personaTres = new Persona("Rodrigo", "Lopez"); 
        /*En este caso utilice el constructor que 
        solo tiene de parametros el nombre y apellido */
        
        /*Otro ejemplo*/
        Persona personaCuatro = new Persona(personaUno); 
        /*Utilizo el constructor que tiene de parametro un objeto y de esa manera creo otro
        pero con los mismos valores */ 
        
        System.out.println("Persona cuatro " + personaCuatro.toString());
    }
}
