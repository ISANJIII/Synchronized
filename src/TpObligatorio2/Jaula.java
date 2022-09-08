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
public class Jaula {

 private final Hamaca ham;
 private final Plato plat;
 private final Rueda rue;

 public Jaula() {
  ham = new Hamaca();
  plat = new Plato();
  rue = new Rueda();
 }

 public void entrarAJaula(String name) throws InterruptedException {
  boolean act1 = false;
  boolean act2 = false;
  boolean act3 = false;
  //si todas actividades hechas se para
  while (!act1 || !act2 || !act3) {

   if (!act1) {
    synchronized (ham) {
     if (!ham.verEstadoHamaca()) {

      ham.ocuparHamaca();

      Thread.sleep(1000);
      ham.desocuparHamaca();

      act1 = true;
     }
    }

   }

   if (!act2) {
    synchronized (plat) {
     if (!plat.verEstadoPlato()) {

      plat.ocuparPlato();
      Thread.sleep(1000);
      plat.desocuparPlato();

      act2 = true;

     }
    }

   }

   if (!act3) {
    synchronized (rue) {
     if (!rue.verEstadoRueda()) {

      rue.ocuparRueda();
      Thread.sleep(1000);
      rue.desocuparRueda();

      act3 = true;
     }
    }

   }

  }

 }

}
