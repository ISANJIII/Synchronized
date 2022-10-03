package barberoDormilon;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestBarbero {

 public static void main(String[] args) {

  //recurso compartido
  Barberia b1 = new Barberia();
  //Hilos
  Barbero b = new Barbero("Cristopher", b1);
 
  Cliente c = new Cliente("Facu", b1);
  Cliente d = new Cliente("Celi", b1);
  Cliente e = new Cliente("Franco", b1);
  Cliente f = new Cliente("Guille", b1);
  Cliente g = new Cliente("Seba", b1);
  Cliente h = new Cliente("jamiro", b1);
  Cliente j = new Cliente("Silvia", b1);
 
  b.start();
  c.start();
  g.start();
  d.start();
  e.start();
  f.start();
  //PRUEBA PARA VER SI LOS ASIENTOS DE ESPERA SE REDUCEN LUEGO DE ATENDER A LOS QUE YA ESTABAN 
  try {
   //LUEGO DE UN TIEMPO UN CLIENTE LLEGA Y OTRO TAMBIEN PERO ESTE QUEDARA EN ESPERA
   Thread.sleep(10000);

   h.start();
   j.start();

  } catch (InterruptedException ex) {
   Logger.getLogger(TestBarbero.class.getName()).log(Level.SEVERE, null, ex);
  }

 }
}
