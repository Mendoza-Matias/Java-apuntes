
package practicas.hilosdos.clases;


public class MiHiloNuevoDos implements Runnable {

    @Override
    public void run() {
        System.out.println("Hilo demonio iniciado");
        
        try{
        Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Hilo demonio terminado");
    }
    
}
