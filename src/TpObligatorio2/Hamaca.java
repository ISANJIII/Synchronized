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
  hamaca = true;

 }

 public synchronized boolean verEstadoHamaca() {
  return hamaca;

 }

 public synchronized void desocuparHamaca() {
  hamaca = false;

 }
}
