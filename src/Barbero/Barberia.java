package barberoDormilon;

import java.util.concurrent.Semaphore;

public class Barberia {

 private Semaphore semSilla, semCliente, semBarbero;

 public Barberia() {
  //inicialmente la silla esta vacia para que el cliente pueda sentarse y tanto el cliente como el barbero estan inactivos sus semaforos
  semSilla = new Semaphore(1);
  semCliente = new Semaphore(0);
  semBarbero = new Semaphore(0);

 }

public void semSillaAdquirir() throws InterruptedException{
 semSilla.acquire();
}
 public void semSillaLiberar() throws InterruptedException{
 semSilla.release();
}
 
 public void semClienteLiberar() throws InterruptedException{
  semCliente.release();
}
  public void semClienteAdquirir() throws InterruptedException{
 semCliente.acquire();
}
  
  public void semBarberoLiberar() throws InterruptedException{
 semBarbero.release();
}
  public void semBarberoAdquirir() throws InterruptedException{
 semBarbero.acquire();
}
  
}
