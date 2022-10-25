/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package TPORelojAlarma;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Reloj extends Thread {
    
    private int hora;
    private RelojCompartido rej;
    private boolean crearCercanos;
    private Durmientes d;
    
    public Reloj(RelojCompartido reloj) {
        hora = 0;
        rej = reloj;
        crearCercanos = true;
        
    }

    //un reloj que simula las horas que transcurre
    public void run() {
        int i = 0;
        while (true) {
            
            try {
                if (hora == 24) {
                    hora = 0;
                } else {                    
                    System.out.println("La hora es: " + hora);
                    hora++;                    
                    rej.cambiarHora(hora);
                    
                }

                //cada segundo es una 1 hora
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
            }
            
        }
    }
}
