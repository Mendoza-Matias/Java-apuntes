
package practicas.hilosdos.clases;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Receptor implements Runnable{

    private Mensaje mensaje;

    public Receptor(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public void run() {
        for (String msg = mensaje.leer() ; msg.equals("finalizar "); msg = mensaje.leer()) {
            System.out.println("Mensaje recibido " + msg);
        }
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Receptor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
