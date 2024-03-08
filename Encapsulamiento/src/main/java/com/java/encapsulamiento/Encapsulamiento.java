

package com.java.encapsulamiento;


public class Encapsulamiento {
    //Lo acorde es realizar los atributos y ponerlos en privado
    private String nombre;
    private int edad;
    private String genero;
    
    public Encapsulamiento(){
    
    }
    //Crear objetos por medio de los constructores.
    public Encapsulamiento(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //Acceder y ingresar valores por medio de los getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    /*Encapsulación : todo se puede acceder por medio de esta clase.*/
}
