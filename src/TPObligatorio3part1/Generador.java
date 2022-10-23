/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPObligatorio3part1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Generador extends Thread {

    private Recipiente reci;
    private Random x= new Random(), tiempo= new Random();

    public Generador(Recipiente reci) {
        this.reci = reci;
    }

    public void run() {
        int i;

        while (true) {

            i = x.nextInt(2);
            if (i == 0) {
                //genero hidrogeno
                System.out.println("Se genero un atomo de hidrogeno.");
                reci.almacenarHidrogeno();
            } else {
                //genero oxigeno
                System.out.println("Se genero un atomo de Oxigeno.");
                reci.almacenarOxigeno();
            }
            try {
                Thread.sleep(( tiempo.nextInt(2)) * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
