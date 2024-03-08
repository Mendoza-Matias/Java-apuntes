package practicas.genericos.clasesdos;


/*Aceptara solo elementos que sean de clase firuga geometrica
Lo limitamos*/
public class CalcularArea<T extends FiguraGeometrica> {
//Atributo geometrico
    private T figura;

    public CalcularArea(T figura) {
        this.figura = figura;
    }

    public double calcularArea() {
        //Instancia para comparar si es de un tipo de clase
        if (figura instanceof Circulo) {
            System.out.println("Calculando area de un circulo");
        } else if (figura instanceof Cuadrado) {
            System.out.println("Calculando area de un cuadrado");
        } else if (figura instanceof Triangulo) {
            System.out.println("Calculando area de un Triangulo");
        }
        return figura.calcularArea();
    }

}
