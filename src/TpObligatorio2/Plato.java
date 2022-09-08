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
public class Plato {

 private boolean plato = false;

 public synchronized void ocuparPlato() {
  plato = true;

 }

 public synchronized boolean verEstadoPlato() {
  return plato;

 }

 public void desocuparPlato() {
  plato = false;

 }
}
