package barberoDormilon;

import java.util.Random;


public class Barbero extends Thread {

 private Barberia local;

 public Barbero(String name, Barberia b) {
  super(name);
  local = b;
 }

 public void run() {
  try {
   local.semClienteAdquirir();
   System.out.println("EL cliente descanza mientras es ATENDIDO");

   realizandoCorte();
   System.out.println("El barbero Termina de cortar.");
   //el barbero termino el trabajo
   local.semBarberoLiberar();

  } catch (InterruptedException ex) {

  }
 }

 private void realizandoCorte() throws InterruptedException {

  //para realizar el corte necesitamos el permiso de semBarbero
  System.out.println("El barbero " + Thread.currentThread().getName() + " PROCEDE A REALIZAR EL CORTE");
  Random x = new Random();
int r=x.nextInt(15);
  for (int i = 0; i < r+1; i++) {
   System.out.print(".");
  }
  try {
   Thread.sleep(1000);
  } catch (InterruptedException exc) {
   System.out.println("Hilo principal interrumpido.");
  }
  System.out.println("");

 }

}
