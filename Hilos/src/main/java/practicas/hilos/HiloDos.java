package practicas.hilos;

import practicas.hilos.clases.MiHiloDos;

public class HiloDos {

    public static void main(String[] args) {

        System.out.println("Ejecutando el hilo");

        MiHiloDos hilo = new MiHiloDos("Hilito");
        MiHiloDos hiloDos = new MiHiloDos("Hilito dos");
        MiHiloDos hiloTres = new MiHiloDos("Hilito Tres");

        /*No hace falta construir el hilo ya que extendemos 
        de la clase thread*/
        hilo.start();
        hiloDos.start();
        hiloTres.start();
    }
}
