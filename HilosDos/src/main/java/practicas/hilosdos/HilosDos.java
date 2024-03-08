

package practicas.hilosdos;

import practicas.hilosdos.clases.MiHiloNuevo;

public class HilosDos {
    /*Nombrar un hilo*/
    public static void main(String[] args) {
        /*Prioridad de hilos*/
        
        
        //creacion de hilos
        MiHiloNuevo mh1 = new MiHiloNuevo();
        MiHiloNuevo mh2 = new MiHiloNuevo();
        MiHiloNuevo mh3 = new MiHiloNuevo();
        
        //Obtener la prioridad de los hilos
        
        System.out.println("Prioridad " + mh1.getPriority());
        System.out.println("Prioridad " + mh2.getPriority());
        System.out.println("Prioridad " + mh3.getPriority());
        
        //Asignamos la prioridades
        
        mh1.setPriority(1);
        mh2.setPriority(5);
        mh2.setPriority(10);
        
        System.out.println("Prioridad " + mh1.getPriority());
        System.out.println("Prioridad " + mh2.getPriority());
        System.out.println("Prioridad " + mh3.getPriority());
    }
}
