package practicas.hilos.clases;

/*Creando un hilo con la interfaz Runnable.*/
public class MiHilo implements Runnable {
    //Atributos

    private String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Comenzando la ejecución del hilo " + nombre);

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000); //Dormimos el hilo medio segundo
                System.out.println("Ejecutando las vueltas " + i + " " + nombre);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Terminando ejecucion del hilo");
    }
    
    
}
