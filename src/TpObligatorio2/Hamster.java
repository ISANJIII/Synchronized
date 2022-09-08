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
public class Hamster extends Thread {

 private Jaula jl = new Jaula();

 public Hamster(String name, Jaula j) {
  super(name);
  jl = j;
 }

 @Override
 public void run() {

  try {
   jl.entrarAJaula(Thread.currentThread().getName());
  } catch (InterruptedException ex) {
  
  }

 }

}
