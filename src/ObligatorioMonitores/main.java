/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObligatorioMonitores;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class main {
     public static void main(String[] args) {
      

             
      int total=55;
         Lugares lug= new Lugares();
         
         Buque  buque= new Buque(lug);
         Auto[] autos= new Auto[total];

         
         for (int i = 0; i < total; i++) {
             autos[i]= new Auto(lug);
         }
       buque.start();
         for (int i = 0; i < total; i++) {
             autos[i].start();
         }
        
         
         

    }
}
