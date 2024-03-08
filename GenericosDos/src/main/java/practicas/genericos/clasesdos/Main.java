
package practicas.genericos.clasesdos;

public class Main {
    public static void main(String[] args) {
        
        
        Circulo circulo = new Circulo(5.05);
        Cuadrado cuadrado = new Cuadrado(5);
        Triangulo triangulo = new Triangulo(5, 2);
        
        CalcularArea<Circulo> calcularArea = new CalcularArea<>(circulo);
        CalcularArea<Triangulo> calcularAreaDos = new CalcularArea<>(triangulo);
        CalcularArea<Cuadrado> calcularAreaTres = new CalcularArea<>(cuadrado);
    
        System.out.println(calcularArea.calcularArea());
        System.out.println(calcularAreaDos.calcularArea());
        System.out.println(calcularAreaDos.calcularArea());
    
    }
}
