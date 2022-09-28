package barberoDormilon;



public class TestBarbero {

 public static void main(String[] args) {

  //recurso compartido
  Barberia b1 = new Barberia();
  //Hilos
  Barbero b = new Barbero("Carlos", b1);
  Cliente c = new Cliente("Pedro", b1);



  
  



 }

 /*
  Thread barbero = new Thread(new Barbero());
		Thread[] clientes = new Thread[15];

		for (int cliente = 0; cliente < clientes.length; cliente++) {
			clientes[cliente] = new Thread(new Cliente(cliente));
		}

		// El barbero comienza a trabajar
		barbero.start();

		// Los clientes llegan cada 2 segundos, pueden haber 7 sillas ocupadas
		// simultáneamente
		for (int cliente = 0; cliente < clientes.length; cliente++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			clientes[cliente].start();
		}
  */
}
