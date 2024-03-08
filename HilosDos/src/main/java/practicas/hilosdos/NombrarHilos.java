
package practicas.hilosdos;


public class NombrarHilos {
    public static void main(String[] args) {
        
        
        /*Nombro a mi hilo*/
        Thread hilo = new Thread("Hilo uno");
        
        /*Con set name podemos nombrar un hilo o reaccionarle otro valor*/
        
        System.out.println(hilo.getName()); /*Obtengo el nombre del hilo*/
    }
}
