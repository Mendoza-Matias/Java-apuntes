
package practicas.hilosdos;

import practicas.hilosdos.clases.MiHiloNuevoDos;

public class DemonThread {
    public static void main(String[] args) {
        
        
        Thread hiloDemonio = new Thread(new MiHiloNuevoDos());
        
        //Establecemos el hilo como demonio.
        hiloDemonio.setDaemon(true);
        
        
        hiloDemonio.start();
        
        System.out.println("Hilo principal terminado");
        
        System.out.println("Demon Thread " + hiloDemonio.isDaemon());
    }
}
