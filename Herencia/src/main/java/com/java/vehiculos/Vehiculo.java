
package com.java.vehiculos;

public class Vehiculo {
    //Atributos
    private String marca;
    private String matricula;
//    final int CODIGO_AUTO = 555; Todo en mayuscula y separada con guiones bajos
    
    final int CODIGO_AUTO; //USO DE FINAL
    public int velocidadMaxima = 120; 
    
    //Por medio de un constructor
    public Vehiculo(){
        CODIGO_AUTO = 6000; //Si va a estar en un constructor , debe estar en todos
    }

    public Vehiculo(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
        CODIGO_AUTO = 6000; 
    }
      
    
    //Tambien lo podemos hacer en un constructor y debe estar en todos
    
    //Metodos

    public void mostrarVelocidadMaxima(){
        System.out.println("Velocidad maxima : " + velocidadMaxima);
    }
    
    public void mostrarDetalles(){
        System.out.println("Marca : " + marca + " " + "matricula: " + matricula);
    }
    
    public void holaDesdeLaClasePadre(){
        System.out.println("Hola desde la clase padre.");
    }
    
    //METODO QUE ESTA EN TODOS PERO SOBRE ESCRITO
    public void saludos(){
        System.out.println("saludo desde vehiculo");
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    public void frenar(){
        System.out.println("Frenando");
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula + '}';
    }
    
    
}
