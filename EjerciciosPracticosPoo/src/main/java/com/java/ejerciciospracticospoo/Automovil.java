/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.ejerciciospracticospoo;

/**
 *
 * @author Matias
 */
public class Automovil {

    private String Marca;
    private String Color;
    private int Potencia;
    private double Precio;

    /*Constructores*/
    public Automovil() {

    }

    /*Constructores con parametros*/
    public Automovil(String Marca, String Color, int Potencia, double Precio) {
        this.Marca = Marca;
        this.Color = Color;
        this.Potencia = Potencia;
        this.Precio = Precio;
    }

    /*Getter y Setters*/
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    /*Metodo toString*/
    @Override
    public String toString() {
        return "Automovil{" + "Marca=" + Marca
                + ", Color=" + Color
                + ", Potencia=" + Potencia
                + ", Precio=" + Precio + '}';
    }

}
