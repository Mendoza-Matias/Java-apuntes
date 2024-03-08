
package com.java.claseobject.clases;


public class Melon {
    
    //Atributos
    private String nombre;
    private String tipo;
    private int peso;
    
    //Constructores
    public Melon(){
    
    }
    
    public Melon(String nombre,String tipo,int peso){
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Objeto Melon" + "nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso;
    }
    
    
    
    
}
