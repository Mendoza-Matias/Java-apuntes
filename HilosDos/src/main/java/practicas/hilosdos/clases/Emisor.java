
package practicas.hilosdos.clases;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Emisor implements Runnable {

    //Atributos 
    private Mensaje mensaje;

    public Emisor(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    @Override
    public void run() {
        String[] matrizMensaje = {"mensaje1","mensaje2","mensaje3","finalizar"};
        
        for (String msg : matrizMensaje) {
            mensaje.escribir(msg);
            
            try {
                Thread.sleep(50000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Emisor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
