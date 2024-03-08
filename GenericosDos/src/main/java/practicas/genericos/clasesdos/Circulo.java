
package practicas.genericos.clasesdos;


public class Circulo extends FiguraGeometrica {

    private double radio;
    
    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
    
    @Override
    double calcularArea() {
       return Math.PI * Math.pow(radio, 2);
    }
    
}
