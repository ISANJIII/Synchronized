package barberoDormilon;

public class Barbero extends Thread {

 private Barberia local;

 public Barbero(String name, Barberia b) {
  super(name);
  local = b;
 }

 @Override
 public void run() {
  while (true) {
   try {
//ES PERO QUE EL SEMCLIENTE TENGA UN PERMISO...ESTE SE LO PROPORCIONARA LA CLASE CLIENTE
    local.semEsperoCliente();

    System.out.println("EL cliente descanza mientras es ATENDIDO");
//SIMULO EL TIEMPO DE CORTE....
    realizandoCorte();
    System.out.println("El barbero " + Thread.currentThread().getName() + " Termina de cortar.");
    //el barbero termino el trabajo POR LO TANTO LE AVISO AL CLIENTE (DOY 1 PERMISO AL SEMBARBERO)
    local.semBarberoLiberar();

   } catch (InterruptedException ex) {

   }

  }

 }

 private void realizandoCorte() throws InterruptedException {

  //para realizar el corte necesitamos el permiso de semBarbero
  System.out.println("El barbero " + Thread.currentThread().getName() + " PROCEDE A REALIZAR EL CORTE");

  for (int i = 0; i < 10; i++) {

   System.out.print(" .");
   try {

    Thread.sleep(1000);
   } catch (InterruptedException exc) {
    System.out.println("Hilo principal interrumpido.");
   }
  }

  System.out.println("");

 }

}
