
package com.java.clases;

import com.java.interfaces.Interfaces;
import com.java.interfaces.InterfacesGerarquia;

/*Implementando una interfaz en una clase*/

public class Acumulador implements Interfaces,InterfacesGerarquia {

    //Variables
    
    int valor;
    
    //Constructor
    public Acumulador(int valor){
        this.valor = valor;
    }
    
    
    //Metodos
    
    /*Debemos sobre escribir el metodo y implementarlo*/
    @Override
    public void incremento(int a) {
        valor +=a;
    }
    
    /*METODO DE LA OTRA INTERFAZ*/
     @Override
    public void decremento(int a) {
     valor -= a;
    }
    
    public int getValor(){
        return valor;
    }
    
   
    
}
