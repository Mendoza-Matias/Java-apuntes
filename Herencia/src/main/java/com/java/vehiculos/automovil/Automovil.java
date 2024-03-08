package com.java.vehiculos.automovil;

import com.java.vehiculos.Vehiculo;

public class Automovil extends Vehiculo {

    private String modelo;
//    public int velocidadMaxima ; Como no estoy usando la palabra super que apunta a el valor del atributo propio de la clase padre con el valor que tiene
    
    
    public Automovil() {

    }

    public Automovil(String modelo, String marca, String matricula) {
        super(marca, matricula);
        this.modelo = modelo;
    }
    

    @Override
    public void mostrarVelocidadMaxima() {
        System.out.println("Velocidad maxima : " + super.velocidadMaxima); //Con la palabra super apunto al valor pero que tiene la variable en Vehiculo
    }
    
    //Metodo sobreescrito
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles(); //Uso super para referenciar al metodo de la clase padre
        System.out.println("Modelo :" + modelo);
    }
    

    //Uso de la palabra super
    public void holaDesdeLaClaseHija() {
        super.holaDesdeLaClasePadre();//Uso de la palabra super 
        //UTILIZO EL METODO DE LA CLASE PADRE EN LA CLASE HIJA.
    }

    //METODO QUE ESTA EN TODOS PERO SOBRE ESCRITO
    @Override
    public void saludos(){
        System.out.println("saludo desde Automovil");
    }
    
    
    //Metodos
    public void ajustarAsiento() {
        System.out.println("Ajustando el asiento.");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

}
