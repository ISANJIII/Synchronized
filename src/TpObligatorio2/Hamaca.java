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
public class Hamaca {

 private boolean hamaca ;
 
 public Hamaca(){
  hamaca=false;
 }

 public synchronized void ocuparHamaca() {
  System.out.println("La rata " + Thread.currentThread().getName() + " ocupo la hamaca.");
  hamaca = true;


 }

 public  synchronized boolean verEstadoHamaca() {
  return !hamaca;
 }

 public synchronized void desocuparHamaca() {
  System.out.println("La rata " + Thread.currentThread().getName() + " desocupo la hamaca.");
  hamaca = false;

 }



}
