
package Clases;

public enum EnumConValores {
     //Enums
    COCHE(60),COLECTIVO(30),BICICLETA(50),CAMION(20),AVION(180),TREN(100),BARCO(80);
    
    //Variables de instancia
    
    private int velocidad; //Atributo
    
    //Constructores (Los constructores de las clases enums son privados)
    private EnumConValores(int velocidad) {
        this.velocidad = velocidad;
    }
    
    //Metodos

    public int getVelocidad() {
        return velocidad;
    }

    
}
