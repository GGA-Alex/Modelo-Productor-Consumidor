
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Consumidor extends Thread{
    private final Monitor monitor;
    private double tiempo;
    private Mensajero mensajero;

    public Consumidor(Monitor monitor, double tiempo, Mensajero mensaje) {
        this.monitor = monitor;
        this.tiempo = tiempo;
        this.mensajero = mensaje;
    }
    
    public void run(){
        while(true){
            try {
                int autoRemovido = this.monitor.retirar();
                this.mensajero.removerCarroTabla(String.valueOf(autoRemovido));
                sleep((int) (this.tiempo * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void cambiarTiempo(double tiempo){
        this.tiempo = tiempo;
    }
}
