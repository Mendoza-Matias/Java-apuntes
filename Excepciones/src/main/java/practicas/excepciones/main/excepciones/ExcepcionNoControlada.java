package practicas.excepciones.main.excepciones;

public class ExcepcionNoControlada {

    public static void main(String[] args) {
        /*NoChecked
        
        Java no nos obliga a capturar nada
        Solo nos dice que el objeto es null
        Dependera de nosotros hacerlo.*/

        try {
            String nombre = null;
            System.out.println("Nombre " + nombre.length());
        } catch (Exception e) { //Exception engloba a todas
            System.out.println("No puede apuntar a un objeto null");
        }

    }
}
