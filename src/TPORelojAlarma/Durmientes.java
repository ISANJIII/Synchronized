/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPORelojAlarma;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristopher.Ovaillos
 */
public class Durmientes extends Thread {
    
    private Random x = new Random();
    private int horaDespertarse;
    private RelojCompartido r;
    private boolean cercanoAReloj;
    
    public Durmientes(RelojCompartido r, boolean c) {
        //los hilos se pueden despertar dentro de las 5 am o 8 am
        horaDespertarse = (x.nextInt(3)) + 5;
        this.r = r;
        cercanoAReloj = c;
    }
    
    public void run() {
        
      while(true){
        if(r.verHora(horaDespertarse,Thread.currentThread().getName())){
           
        }    
        
      }
      
        
        
    }
    
}
