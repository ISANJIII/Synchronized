package ObligatorioMonitores;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Lugares {

    private final int tamanio = 10;
    private Semaphore sem;

    private int pos = 0;

    public Lugares() {
        sem= new Semaphore(0);

    }

    public synchronized boolean agregar() {

        boolean seAgrego = false;
        if (pos < tamanio) {
            sem.release(1);
            pos++;
            seAgrego=true;
        }
        

        return seAgrego;
    }

    public synchronized boolean buqueLLeno() {
        boolean lleno = false;
        
        if(pos==tamanio){
            
        
            
            try {
               
                sem.acquire(10);
                
                lleno = true;
            } catch (InterruptedException ex) {
                Logger.getLogger(Lugares.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
        return lleno;
    }

    public int getTamanio() {
        return tamanio;
    }
    public  void vaciar(){
        pos=0;
        
    }
}
