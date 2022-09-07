/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Cliente implements Runnable {

 private Asiento silla;
 private String nombre;
 private int reserva;

 public Cliente(String name, int asiento, Asiento a) {
  this.nombre = name;
  this.reserva = asiento;
  this.silla = a;
 }

 @Override
 public void run() {
 
  try {
   Thread.sleep(1000);
   hacerReserva(reserva);

  } catch (InterruptedException ex) {
   Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
  }

 }

 private synchronized void hacerReserva(int i) throws InterruptedException {
  if (i >= 0 && i < silla.longitudAsientos()) {

   if (!silla.verEstadoDeAsiento(i)) {

    silla.ReservarAsiento(i);
    System.out.println("El Cliente " + nombre + " pudo realizar la reserva del asiento " + reserva);
    System.out.println(silla.verEstadoDeAsiento(i));
   } else {

    System.out.println("El Cliente " + nombre + " No pudo realizar la reserva del asiento " + reserva);
   }
  }

 }
}
