package barberoDormilon;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends Thread {

 private Barberia local;

 public Cliente(String name, Barberia b) {
  super(name);
  local = b;
 }

 public void run() {
  try {
   local.semSillaAdquirir();
   System.out.println(Thread.currentThread().getName() + " Llega a la Barberia.");
   System.out.println("El cliente despierta al barbero para ser atendido");
   local.semClienteLiberar();
   local.semBarberoAdquirir();
   System.out.println("El cliente se despide :D");
   local.semSillaLiberar();
   

  } catch (InterruptedException ex) {
  }

 }

}
