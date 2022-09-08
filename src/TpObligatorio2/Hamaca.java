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

 private boolean hamaca = false;

 public void ocuparHamaca() {
  System.out.println("La rata " + Thread.currentThread().getName() + " ocupo la hamaca.");
  hamaca = true;
 }

 public boolean verEstadoHamaca() {
  return hamaca;

 }

 public  void desocuparHamaca() {
System.out.println("La rata " + Thread.currentThread().getName() + " desocupo la hamaca.");
  hamaca = false;

 }
}
