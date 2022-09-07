/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSynchronized;

/**
 *
 * @author asdf
 */
public class Jaula {
 
private boolean hamaca=false;
private boolean rueda=false;
private boolean plato=false;

 public Jaula() {
 }
 

public synchronized void ocuparHamaca(){
 hamaca= true;
 
}

public synchronized void ocuparRueda(){
rueda= true;
 
}
public synchronized void ocuparPlato(){
 plato= true;
 
}

 public synchronized boolean isHamaca() {
  return hamaca;
 }

 public synchronized boolean isRueda() {
  return rueda;
 }

 public synchronized boolean isPlato() {
  return plato;
 }



 
}
