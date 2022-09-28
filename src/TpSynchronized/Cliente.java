/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Cliente implements Runnable {

    private Asiento silla;
    private String nombre;
    private int reserva;

    public Cliente(String name, int asiento, Asiento a) {
        this.nombre = name;
        this.reserva = asiento;
        this.silla = a;
    }

    @Override
    public void run() {

        if (silla.reservar(reserva)) {
            System.out.println(Thread.currentThread().getName() + " reservo");
        } else {
            System.out.println(Thread.currentThread().getName() + " no reservo");

        }

    }

}
