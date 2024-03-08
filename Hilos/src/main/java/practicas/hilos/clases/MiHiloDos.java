package practicas.hilos.clases;

public class MiHiloDos extends Thread {

    /*Implemento el constructor de la clase
    Padre.*/
    public MiHiloDos(String name) {
        super(name);
    }

    //Metodos 
    @Override
    public void run() {
        System.out.println("Ejecucion del Hilo " + getName()); //Obtengo el nombre del hilo

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000); //Dormimos el hilo medio segundo
                System.out.println("Ejecutando las vueltas " + i + " " + getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Terminando ejecucion del Hilo " + getName());
    }

}
