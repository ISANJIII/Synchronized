/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Usuario extends Thread {

 private char trabajo;
 private Impresora col;

 public Usuario(char trabajo, Impresora col) {
  this.col = col;
  this.trabajo = trabajo;

 }

 public void run() {

  int pos;
  //va iterar tantas veces hasta conseguir un permiso de una impresora libre

  try {
   if (trabajo == 'A') {

    pos = col.SolicitarPermiso(trabajo);

    System.out.println("_El usuario imprime trabajo de tipo " + trabajo + " en la impresora " + pos);
    Thread.sleep(1000);

    System.out.println("_El usuario termino de imprimir un trabajo de tipo " + trabajo + " en la impresora " + pos);
    col.yaTermineDeUsarLaImpresoraA(pos, trabajo);

   }
   if (trabajo == 'B') {

    pos = col.SolicitarPermiso(trabajo);
    System.out.println("_El usuario imprime trabajo de tipo " + trabajo + " en la impresora " + pos);

    Thread.sleep(1000);
    System.out.println("_El usuario termino de imprimir un trabajo de tipo " + trabajo + " en la impresora " + pos);
    col.yaTermineDeUsarLaImpresoraB(pos, trabajo);

   }

  } catch (InterruptedException ex) {
   Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
  }

 }

}
