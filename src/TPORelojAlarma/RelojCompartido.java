package TPORelojAlarma;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class RelojCompartido {

    private int cantDurmientes;
    private int contadorVerificarHora;
    private int hora;
    private Semaphore termino;

    public RelojCompartido(int cant) {
        /*necesito saber cuantos hilos durmientes existen
        para no notificar de mas.
         */
        cantDurmientes = cant;
        contadorVerificarHora = 0;
        hora = 0;
        termino = new Semaphore(0);

    }

    public synchronized void cambiarHora(int nuevaHora) {
        boolean todos = false;
        while (!todos) {

            try {
                termino.acquire(cantDurmientes);
                this.notifyAll();
            } catch (InterruptedException ex) {
                Logger.getLogger(RelojCompartido.class.getName()).log(Level.SEVERE, null, ex);
            }
            todos = true;

        }

        contadorVerificarHora = 0;
        hora = nuevaHora;

    }

    public synchronized boolean verHora(int i,String nam) {
        
        boolean desperto=false;
        //indico que el hilo durmiente entro a este metodo para dar un permiso al cambiarHora que es usado por el reloj para indicar que puede ver la hora ya que todos los vieron
        System.out.println("--");
         if (hora == i) {
            System.out.println("se desperto el hilo "+nam+" sale a trabajar....");
             desperto=true;
        }
        
        termino.release();
        try {
            this.wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(RelojCompartido.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        return desperto;

    }

}
