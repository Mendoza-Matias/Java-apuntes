
package practicas.hilosdos;

import practicas.hilosdos.clases.Emisor;
import practicas.hilosdos.clases.Mensaje;
import practicas.hilosdos.clases.Receptor;


public class MetodosThread {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        
        Thread thread = new Thread(new Emisor(msg));
        
        Thread receptor = new Thread(new Receptor(msg));
        
        thread.start();
        receptor.start();
        
        /*El emisor lo envia , el receptor lo recibe y ambos estan 
        sincronizados*/
    }
}
