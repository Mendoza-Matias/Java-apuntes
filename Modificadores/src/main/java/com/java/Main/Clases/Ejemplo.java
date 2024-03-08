
package com.java.Main.Clases;


public class Ejemplo {
   
    //Atributos
    private int atributoUno; //No tenemos acceso desde el main
    private int contador;
    int atributoDos; //Metodo con modificador por default.
    protected int atributoTres; //Ejemplo con el protected
    
    //Constructor

    public void Ejemplo(){
        contador = 0;
    }
    
    //Metodos

    public int getAtributoUno() {
        return atributoUno;
    }

    public void setAtributoUno(int atributoUno) {
        contador++;
        this.atributoUno = atributoUno;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    /*Siempre que estemos dentro de la clase podemos
    acceder a todos sus metodos.*/
    
    /*Si se encuentra en otro paquete la clase no se puede acceder a los atributos.*/       
            
}
