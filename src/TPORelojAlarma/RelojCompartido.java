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

    private boolean[] a;

    public RelojCompartido(int cant) {
        /*necesito saber cuantos hilos durmientes existen
        para no notificar de mas.
         */
        cantDurmientes = cant;
        contadorVerificarHora = 0;
        hora = 0;

        a = new boolean[cant];

    }

    public synchronized void reiniciarArreglo() {
        //se reiniciara a las 24 horas
        for (int i = 0; i < cantDurmientes; i++) {
            a[i] = false;
        }
    }

    public synchronized void cambiarHora(int nuevaHora) {
        this.notify();
        contadorVerificarHora = 0;
        hora = nuevaHora;
    }

    public synchronized boolean verHora(int i, int n) {

        boolean desperto = false;
        //indico que el hilo durmiente entro a este metodo para dar un permiso al cambiarHora que es usado por el reloj para indicar que puede ver la hora ya que todos los vieron
//        System.out.println("--");

        //ya deberian estar todos despiertos despues de las 8 am
        if (hora > 7 || hora < 5) {
        } else {
            try {
                //luego de avisar que ya mire la hora paso a espera hasta que todos los hilos ya hayan mirado esto
                this.wait();

            } catch (InterruptedException ex) {
            }

            //Cada hilo se levanta y despierta a su vecino y chequea si es su hora
            if (contadorVerificarHora < cantDurmientes) {

                contadorVerificarHora++;
                //despierto a mi vecino    
                this.notify();
                if (!a[n]) {

                    System.out.println("             Se despierta el hilo " + n + "| HORA DE ALARMA " + i + " y avisa a su vecino.");
                    //veo si es mi hora
                    if (hora == i) {
                        System.out.println("    Es HORA del hilo " + n + " sale a trabajar.");
                        desperto = true;
                        a[n] = true;
                    } else {
                        //de lo contrario vuelvo a dormir
                        System.out.println("             Vuelve a dormir el hilo " + n + " : La hora es " + hora + "  se despierta a  las " + i);
                    }

                }
            }
        }

        return desperto;

    }

}
