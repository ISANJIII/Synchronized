package Cocher;

/**
 *
 * @author asdf
 */
public class CochesO_E extends Thread {

 private GestorCruce gest; private int cod;



 public CochesO_E(int s, GestorCruce g) {
  cod = s;
  gest = g;
 }

 public void run() {

  boolean terminar = true;
  System.out.println("                     llega Oeste: " + cod);
  try {
   while (terminar) {

    terminar = gest.puedePasarO(cod);
    Thread.sleep(1000);
   }

  } catch (InterruptedException ex) {

  }
  System.out.println("                     paso a este: " + cod);
 }

}
