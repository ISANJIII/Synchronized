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
 
 private Jaula j;
 
 public Hamster(String name, Jaula jl) {
  super(name);
  
  j = jl;
 }
 
 @Override
 public void run() {
  
  j.realizarActividad();
  
 }
 
}
