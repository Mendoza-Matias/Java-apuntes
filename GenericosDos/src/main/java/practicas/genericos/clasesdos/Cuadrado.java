
package practicas.genericos.clasesdos;


public class Cuadrado extends FiguraGeometrica {
    
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    double calcularArea() {
        return Math.pow(lado, 2); //Elevar un valor al cuadrado
    }
    
}
