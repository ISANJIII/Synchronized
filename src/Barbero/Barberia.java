package Barbero;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Barberia {

 private Semaphore revisarSillas;

 private Semaphore semCliente;
 private Semaphore semBarbero;
 private Semaphore sillaDeEspera;
 private boolean sillaOcupada;
 private final int TOTAL = 5;
 private int OCUPADO;

 public Barberia() {
  //inicialmente la silla esta vacia para que el cliente pueda sentarse y tanto el cliente como el barbero estan inactivos sus semaforos
  revisarSillas = new Semaphore(1);
  semCliente = new Semaphore(0);
  semBarbero = new Semaphore(0);
  sillaDeEspera = new Semaphore(1);
  sillaOcupada = true;
  OCUPADO = 0;

 }

 public boolean buscarAsiento(String name) {
  
  
  
  /*hay 3 tipos de cliente
  1. AL QUE ATIENDEN
  2. AL QUE ESPERA QUE LO ATIENDE SOLO HAY 3 SILLAS DE ESPERA
  3. EL QUE NO ESPERA PORQUE NO HAY SILLA DE ESPERA
   */
  boolean retornar = false;
  boolean exito = true;
  boolean yaFueAceptado = false;
  //ITERAR TANTAS VECES HASTA QUE SEA SU TURNO DE AQUELLOS CLIENTES QUE SE ENCUENTREN EN SILLA DE ESPERA
  while (exito) {
   try {
    sillaDeEspera.acquire();
//VEO SI LA SILLA ESTA OCUPADA O NO
    if (sillaOcupada) {
     System.out.println("----EL CLIENTE " + name + " ENTRA ----");
     sillaOcupada = false;
 
     exito = false;
     retornar = true;
    } else {
     
     if (!yaFueAceptado) {
      //veo si tiene lugar en las silla de espera...esto se pregunta solo una vez
      if (OCUPADO < TOTAL) {
       System.out.println("            EL CLIENTE " + name + " SE QUEDA ESPERANDO............");
//CAMBIO A TRUE LA VARIABLE INDICANDO QUE EL CLIENTE YA FUE ACEPTADO...OSEA SE ENCUENTRA EN UNA SILLA DE ESPERA HASTA SU TURNO
       yaFueAceptado = true;
       OCUPADO++;

      } else {//NO HAY SILLA DE ESPERA
       System.out.println("            LOS ASIENTOS DE ESPERA ESTAN TODOS OCUPADOS...EL CLIENTE " + name + " SE VA :C");
       exito = false;
      }
     }

    }

    sillaDeEspera.release();
   } catch (InterruptedException ex) {
   }
  }

  return retornar;
 }

 public void semSillaOcupar() throws InterruptedException {
  revisarSillas.acquire();
 }

 public void semSillaLiberar() throws InterruptedException {

  revisarSillas.release();
  sillaOcupada = true;
  OCUPADO--;
 }

 public void semHayCliente() throws InterruptedException {
  semCliente.release();
 }

 public void semEsperoCliente() throws InterruptedException {
  semCliente.acquire();
 }

 public void semBarberoLiberar() throws InterruptedException {
  semBarbero.release();
 }

 public void semBarberoAdquirir() throws InterruptedException {
  semBarbero.acquire();
 }



}
