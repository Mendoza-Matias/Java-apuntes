package practicas.hilos;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import practicas.hilos.clases.MiHiloDos;

public class HiloTres {

    public static void main(String[] args) {

        System.out.println("El hilo principal acaba de iniciar");
        
        MiHiloDos hilo = new MiHiloDos("Hilito numero 1");
        MiHiloDos hilo2 = new MiHiloDos("Hilito numero 2");

        hilo.start();
        try {
            hilo.join(); /*Estamos haciendo que el hilo principal espere a que el 
            hilo1 acabe su ejecucion.*/
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloTres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*Termina el primer hilo y se ejecuta el otro.*/
        hilo2.start();
        System.out.println("El hilo principal a terminado su ejecución");
    }
}
