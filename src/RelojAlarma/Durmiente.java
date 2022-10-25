/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelojAlarma;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Durmiente extends Thread {

    private Reloj r;

    public Durmiente(Reloj r) {
        this.r = r;
    }

    public void run() {

        while (true) {

            System.out.println("Duerme..");
            sleep();
            
            r.despertar();

            System.out.println("Despierta y trabaja..");
            sleep();

        }

    }

    private void sleep() {
        Random x = new Random();
        int i = x.nextInt(4);

        try {

            Thread.sleep(i * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Durmiente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
