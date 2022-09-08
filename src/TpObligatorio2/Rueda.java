/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpObligatorio2;

/**
 *
 * @author asdf
 */
public class Rueda {

 private boolean rueda = false;
 
 

 public synchronized void ocuparRueda() {
  rueda = true;

 }

 public synchronized boolean verEstadoRueda() {
  return rueda;
 }
 
  public void desocuparRueda() {
  rueda = false;

 }

}
