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
 
 

 public  void ocuparRueda() {
  System.out.println("La rata " + Thread.currentThread().getName() + " ocupo la rueda.");
  rueda = true;

 }

 public  boolean verEstadoRueda() {
  return rueda;
 }
 
  public void desocuparRueda() {
   System.out.println("La rata " + Thread.currentThread().getName() + " desocupo la rueda.");
  rueda = false;

 }

}
