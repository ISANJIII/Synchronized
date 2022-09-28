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

 private boolean rueda ;
 
 
 public Rueda(){
  rueda=false;
 }

 public synchronized void ocuparRueda(){

  System.out.println("La rata " + Thread.currentThread().getName() + " ocupo la rueda.");
  rueda = true;
 
 }

 public  synchronized boolean verEstadoRueda() {
  return !rueda;
 }

 public synchronized void desocuparRueda() {
  System.out.println("La rata " + Thread.currentThread().getName() + " desocupo la rueda.");
  rueda = false;

 }



}
