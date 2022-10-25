package TPORelojAlarma;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristopher.Ovaillos
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
                //para cambiar la hora necesito que todos los hilos durmientes ya hayan mirado su hora
                termino.acquire(cantDurmientes);
                //cuando termino de ver todas las horas los hilos durmientes que ya hayan mirado su hora  estos pasan a un estado de espero 
                //con esto notificamos a todos que pueden seguir verificando la hora
                this.notify();
                contadorVerificarHora++;
            } catch (InterruptedException ex) {
                Logger.getLogger(RelojCompartido.class.getName()).log(Level.SEVERE, null, ex);
            }
            todos = true;

        }

        contadorVerificarHora = 0;
        hora = nuevaHora;

    }

    public synchronized boolean verHora(int i, String nam) {

        boolean desperto = false;
        //indico que el hilo durmiente entro a este metodo para dar un permiso al cambiarHora que es usado por el reloj para indicar que puede ver la hora ya que todos los vieron
//        System.out.println("--");

        //ya deberian estar todos despiertos despues de las 8 am
        if(hora>8){
            termino.release(cantDurmientes);
        }else{
           
            //libero un permiso para "cambiarHora()"
        termino.release();
        try {
            //luego de avisar que ya mire la hora paso a espera hasta que todos los hilos ya hayan mirado esto
            this.wait();

        } catch (InterruptedException ex) {
            Logger.getLogger(RelojCompartido.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Cada hilo se levanta y despierta a su vecino y chequea si es su hora
        if (contadorVerificarHora < cantDurmientes) {
            System.out.println("             Se despierta "+nam+" y avisa a su vecino.");
            contadorVerificarHora++;
            //despierto a mi vecino
            this.notify();

            //veo si es mi hora
            if (hora == i) {
                System.out.println("             Es mi HORA " + nam + " salgo a trabajar el hilo...."+nam);
                desperto = true;
            } else {
                //de lo contrario vuelvo a dormir
                System.out.println("             vuelvo a dormir"+nam);

            }
        }
        }
        

        return desperto;

    }

}
