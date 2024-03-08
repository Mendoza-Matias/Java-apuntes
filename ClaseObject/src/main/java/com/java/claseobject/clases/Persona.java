
package com.java.claseobject.clases;

import java.util.Objects;


public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    //Metodo equals
    @Override
    public boolean equals(Object obj) {
        //Comparaciones
        
        if (this == obj) { //Es un objeto
            return true;
        }
        if (obj == null) { //El objeto no es null
            return false;
        }
        if (getClass() != obj.getClass()) { //Son de la misma clase
            return false;
        }
        
        //Despues de hacer lo de arriba pasa aca y sigue por las comparaciones
        final Persona other = (Persona) obj;
        //Hace un Casting de persona / other nombre.
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + '}';
    }
    
    
    
}
