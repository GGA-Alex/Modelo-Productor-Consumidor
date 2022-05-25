
import java.util.logging.Level;
import java.util.logging.Logger;


public class Monitor {
    private Auto[] estacionamiento;
    private int siguiente;
    private boolean estaVacio;
    private boolean estaLleno;

    public Monitor() {
        this.estacionamiento = new Auto[12];
        this.siguiente = 0;
        this.estaVacio = true;
        this.estaLleno = false;
    }
    
    public synchronized int retirar(){
        while(this.estaVacio){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        siguiente--;
        this.estaLleno = false;
        
        if(siguiente == 0){
            this.estaVacio = true;
        }
        
        notifyAll();
        
        return this.siguiente;
    }
    
    public synchronized int agregar(Auto auto){
        while(this.estaLleno){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.estacionamiento[siguiente] = auto;
        siguiente++;
        this.estaVacio = false;
        
        if(siguiente == this.estacionamiento.length){
            this.estaLleno = true;
        }
        
        System.out.println(siguiente);
        
        notifyAll();
        return siguiente;
    }
    
}
