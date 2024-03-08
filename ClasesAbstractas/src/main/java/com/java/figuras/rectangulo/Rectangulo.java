
package com.java.figuras.rectangulo;

import com.java.figuras.Figuras;

public class Rectangulo extends Figuras {

    //Atributos
    public String tipo;
    
    @Override
    public double calcularArea(double base, double altura) {
      return (base*altura);
    }
    //DEBO IMPLEMENTAR EL METODO DE LA CLASE ABSTRACTA Y REDEFINIRNLO O VOLVER MI CLASE ABSTRACTA
}
