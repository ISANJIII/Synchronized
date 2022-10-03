/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocher;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class CochesN_S extends Thread {
 private GestorCruce gest;
 private int cod;
 public CochesN_S(int s,GestorCruce g){
  cod=s;
  gest=g;
 }
 
 
 public void run(){
  
  boolean terminar=true;
  

   try {
    while(terminar){
    terminar=gest.puedePasarN(cod);
    Thread.sleep(1000);    
   }
 
    
    
    
    
   } catch (InterruptedException ex) {
    Logger.getLogger(CochesN_S.class.getName()).log(Level.SEVERE, null, ex);
   }
  
  

  
  
  
    
  
 }
 
}
