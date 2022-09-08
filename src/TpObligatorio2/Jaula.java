/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpObligatorio2;

import TpSynchronized.*;

/**
 *
 * @author asdf
 */
public class Jaula {

 private Hamaca ham;
 private Plato plat;
 private Rueda rue;

 public Jaula() {
   ham= new Hamaca();
    plat= new Plato();
      rue= new Rueda();
 }

 public void entrarAJaula(String name) throws InterruptedException {
  boolean act1 = false;
  boolean act2 = false;
  boolean act3 = false;
  //si todas actividades hechas se para
  while (!act1 || !act2 || !act3) {
 

   if (!act1) {
    if (!ham.verEstadoHamaca()) {
      ham.ocuparHamaca();
     System.out.println("La rata " + name + " ocupo la hamaca.");
     Thread.sleep(2000);
     ham.desocuparHamaca();
      System.out.println("La rata " + name + " desocupo la hamaca.");
      
      

      
     act1 = true;
    }

   }

   if (!act2) {

    if (!plat.verEstadoPlato()) {
     System.out.println("La rata " + name + " ocupo el plato.");
     plat.ocuparPlato();
     Thread.sleep(2000);
        plat.desocuparPlato();
          System.out.println("La rata " + name + " desocupo el plato.");
     act2 = true;
    }

   }

   if (!act3) {
    if (!rue.verEstadoRueda()) {
     System.out.println("La rata " + name + " ocupo la rueda.");
     rue.ocuparRueda();
     Thread.sleep(2000);
     rue.desocuparRueda();
           System.out.println("La rata " + name + " desocupo la rueda.");
     act3 = true;
    }

   }

  }

 }

}
