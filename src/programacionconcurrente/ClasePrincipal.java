package programacionconcurrente;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClasePrincipal {

 public static void main(String[] args) {
  Proceso1 hilo1 = new Proceso1();

  Thread hilo2 = new Thread(new Proceso2());
  hilo1.start();
  hilo2.start();
//join (): pondrá el hilo actual en espera hasta que el hilo en el que se llama esté muerto. Si el subproceso se interrumpe, arrojará InterruptedException.
// el actual seria el main 

  try {

   hilo1.join();
   hilo2.join();

  } catch (InterruptedException ex) {

  }
 
  System.out.println("fin main");
 }

}
