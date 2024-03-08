
package practicas.hilosdos.clases;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Mensaje {
    private String mensaje;
    private boolean esVacio;

    public Mensaje() {
    }

    
    public Mensaje(String mensaje, boolean esVacio) {
        this.mensaje = mensaje;
        this.esVacio = true;
    }
    
    //Metodos
    
    public synchronized String leer(){
       
        while(esVacio){
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        esVacio = true;
        notifyAll(); /*Este notifica al escribir que siga con la siguiente parte*/
        return mensaje;
    }
    
    public synchronized void escribir (String texto){
        while(!esVacio){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.mensaje = texto;
        esVacio = false;
        notifyAll(); /*Llama y dice que se despierte el receptor Leer*/
    }
    
    
    
}
