package tp5;

import tp5.entidades.Consumidor;
import tp5.entidades.Productor;
import tp5.utilidades.Buffer;
import tp5.utilidades.LimitedQueue;

public class problemaProductorConsumidor {

	public static void main(String[] args) {

		LimitedQueue<Integer> cinta = new LimitedQueue<Integer>(10);

		Buffer buffer = new Buffer(cinta);

		Thread[] hilos = new Thread[4];

		Productor productor1 = new Productor(buffer);
		hilos[0] = new Thread(productor1);

		Consumidor consumidor1 = new Consumidor(buffer, "Consumidor1");
		hilos[1] = new Thread(consumidor1);
		Consumidor consumidor2 = new Consumidor(buffer, "Consumidor2");
		hilos[2] = new Thread(consumidor2);
		Consumidor consumidor3 = new Consumidor(buffer, "Consumidor3");
		hilos[3] = new Thread(consumidor3);

		for (Thread thread : hilos) {
			thread.start();
		}

	}

}
