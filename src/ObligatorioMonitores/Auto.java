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
      
    
        try {
            synchronized (lugares) {
                if (!lugares.agregar()) {

                    System.out.println("Auto espera al buque");
                    lugares.wait();
                    //espera y sigue desde este linea en adelante

                }
               System.out.println("El auto ya subio al buque. ");

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
      

    }

}
