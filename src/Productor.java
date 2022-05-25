
import java.util.logging.Level;
import java.util.logging.Logger;


public class Productor extends Thread{
    private final Monitor monitor;
    private double tiempo;
    private Mensajero mensajero;
    
    private final String[] marcas = {"Toyota", "Ferrari", "Hyundai", "Audi", "Fiat", "Mazda", "Honda", "BMW", "Jeep", "Peugeot", "Renault", "Mini"};
    private final String[] colores = {"Rojo", "Azul", "Verde", "Blanco"};

    public Productor(Monitor monitor, double tiempo, Mensajero mensaje) {
        this.monitor = monitor;
        this.tiempo = tiempo;
        this.mensajero = mensaje;
    }
    
    public void run(){
        while(true){
            try {
                Auto autoAgregado = new Auto(this.marcas[(int) (Math.random() * this.marcas.length)], this.colores[(int) (Math.random() * this.colores.length)]);
                int espacio = this.monitor.agregar(autoAgregado);
                this.mensajero.agregarCarroTabla(String.valueOf(espacio));
                sleep((int) (this.tiempo * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void cambiarTiempo(double tiempo){
        this.tiempo = tiempo;
    }
}
