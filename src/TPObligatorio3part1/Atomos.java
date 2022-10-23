/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPObligatorio3part1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Atomos extends Thread {

    private Recipiente reci;

    public Atomos(Recipiente reci) {
        this.reci = reci;
    }

    public void run() {

        while (true) {

            if (reci.Olisto()) {
                if (reci.Hlisto()) {
                    reci.generarAgua();

                } else {

                }
            } else {

            }

        }

    }

    public void hacerAgua() {

    }
}
