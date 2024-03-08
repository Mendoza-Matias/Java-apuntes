
package practicas.hilos.sincronizacion.main;

import practicas.hilos.sincronizacion.clases.MiHilo;



public class Main {
    public static void main(String[] args) {
        /*Sincronizacion de Hilos*/
        
        int[]matriz = {1,2,3,4,5};
        
        
        MiHilo mh1 = MiHilo.crearEInicia("mh1", matriz);
        MiHilo mh2 = MiHilo.crearEInicia("mh2", matriz);
        
        try{
        mh1.hilo.join(); /*Para la sincronizacion*/
        mh2.hilo.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        /*En ambos hilos respeta el mismo resultado.
        
        Si quitamos la sincronizacion los resultados variaran entre uno 
        y otro.
        Para evitar eso es mejor y recomendable utilizar el syncronized
        
        Ingresa uno , sale , ingresa el otro y sale.*/
    }
}
