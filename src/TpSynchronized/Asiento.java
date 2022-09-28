/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSynchronized;

import java.lang.reflect.Array;

/**
 *
 * @author asdf
 */
public class Asiento {

    //50 asientos
    private boolean[] asiento;

    public Asiento(boolean[] a) {
        this.asiento = a;

    }

    public void ReservarAsiento(int i) {
        this.asiento[i] = true;

    }

    public boolean verEstadoDeAsiento(int i) {
        return asiento[i];
    }

    public int longitudAsientos() {
        return asiento.length;
    }

    public synchronized boolean reservar(int nroAsiento) {
        boolean éxito = false;
        if (!this.verEstadoDeAsiento(nroAsiento)) {
            this.ReservarAsiento(nroAsiento);
            éxito = true;
        }
        return (éxito);
    }

}
