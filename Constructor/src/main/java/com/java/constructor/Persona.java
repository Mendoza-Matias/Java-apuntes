/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.constructor;

/**
 *
 * @author Matias
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    /*Constructor vacio de manera explicita
    No presenta retorno*/
    public Persona(){
    
    }
    /*Sobre carga de constructores
    Creamos varios tipos de constructores que tienen diferentes parametros
    UTILIZAR SIEMPRE QUE SEA NECESARIO.
    */
    public Persona(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    public Persona(int edad){
        this.edad = edad;
    }
    
    public Persona(Persona persona){
        this.nombre = persona.nombre; //Acceso a los atributos de un objeto
        this.apellido = persona.apellido;
        this.edad = persona.edad;
    }
    
    /*Constructor con parametros*/

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
}
