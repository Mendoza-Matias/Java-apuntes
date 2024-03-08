/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practicas.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import practicas.hilos.clases.MiHilo;

/**
 *
 * @author leona
 */
public class Hilos {

    public static void main(String[] args) {
        System.out.println("Hilo ejecutandose");
        
        //Creamos un hilo con una clase propia
        
        MiHilo hilo = new MiHilo("Hilito");
        
        //Construir el hilo con el objeto que hemos creado
        
        Thread hiloEjecutar = new Thread(hilo);
        
        //Comenzamos la ejecucion
        hiloEjecutar.start(); //Comenzamos el hilo
        
        try {
            //Pausar el hilo
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*La ejecucion de un hilo es paralela.*/
        
        System.out.println("Fin del hilo");
    }
}
