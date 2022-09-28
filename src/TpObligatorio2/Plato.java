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

 private boolean plato ;
 
 public Plato(){
  plato=false;
 }

 public synchronized void ocuparPlato()  {
  System.out.println("La rata " + Thread.currentThread().getName() + " ocupo el plato.");
  plato = true;


 }

 public  synchronized boolean verEstadoPlato() {
  return !plato;

 }

 public synchronized void desocuparPlato() {
  System.out.println("La rata " + Thread.currentThread().getName() + " desocupo el plato.");
  plato = false;

 }


}
