/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocher;

/**
 *
 * @author asdf
 */
public class Semaforo extends Thread {

 private GestorCruce gest;

 public Semaforo(GestorCruce gest) {

  this.gest = gest;

 }

 public void run() {

  while (true) {
   gest.iniciar();
  }

 }

}
