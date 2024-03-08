
package practicas.genericos.clases;


public class Edificio implements Imprimibles{
    private String nombre;

    public Edificio(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void imprimir() {
        System.out.println("Edificio: " + nombre);
    }
    
    
}
