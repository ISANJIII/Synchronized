/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpObligatorio2;

import java.util.Random;

/**
 *
 * @author asdf
 */
public class Jaula {

 private Hamaca h;
 private Rueda r;
 private Plato p;

 public Jaula(Hamaca h, Rueda r, Plato p) {
  this.h = h;
  this.r = r;
  this.p = p;

 }

 public void realizarActividad() {


  boolean b = true, c = true, d = true;
  try {
   while (b && c && d) {
    Random x = new Random(2);
    int num = x.nextInt(3);
    switch (num) {

     case 0:
      if (b && h.verEstadoHamaca()) {
       h.ocuparHamaca();
       Thread.sleep(1000);
       h.desocuparHamaca();
       b=false;
       
      }

      ;
      break;
     case 1:
      if (c && r.verEstadoRueda()) {
       r.ocuparRueda();
       Thread.sleep(1000);
       r.desocuparRueda();
       c=false;
      }

      ;
      break;
     case 2:
      if (d && p.verEstadoPlato()) {
       p.ocuparPlato();
       Thread.sleep(1000);
       p.desocuparPlato();
       d=false;
      }

      ;
      break;

    }

   }
  } catch (InterruptedException e) {

  }

 }

}
