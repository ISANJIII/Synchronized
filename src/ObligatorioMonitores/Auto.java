/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObligatorioMonitores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Auto extends Thread {

    private Lugares lugares;

    public Auto(Lugares lug) {
        lugares = lug;
    }

    public void run() {
        boolean seSubio = false;
        while (!seSubio) {
            if (lugares.agregar()) {
                seSubio = true;
                System.out.println("El auto ya subio al buque. " + Thread.currentThread().getName());
            } else {
               

            }
        }

    }

}

// public void run() {
//        boolean a = false;
//        do {
//            if(!a){
//            try {
//                synchronized (lugares) {
//
//                    if (!lugares.agregar()) {
//
//                        System.out.println("Auto espera al buque"+ Thread.currentThread().getName());
//                        lugares.wait();
//                        //espera y sigue desde este linea en adelante
//
//                    } else {
//                        System.out.println("El auto ya subio al buque. "+ Thread.currentThread().getName());
//                        a = true;
//                    }
//
//                }
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        } while (a);
//
//    }
