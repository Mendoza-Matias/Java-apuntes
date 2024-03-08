
package com.java.vehiculos.automovil.coche.moto;
import com.java.vehiculos.Vehiculo; //Clase padre


public class Moto extends Vehiculo{
    //Atributos
    
    private int marchas;
    
    //Metodos

    //METODO QUE ESTA EN TODOS PERO SOBRE ESCRITO
    @Override
    public void saludos(){
        System.out.println("saludo desde Moto");
    }
    
    
    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
    
   
}
