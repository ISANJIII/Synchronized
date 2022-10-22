package tp5.entidades;

import tp5.utilidades.Buffer;

public class Consumidor implements Runnable {

	private Buffer buffer;
	private String nombre;

	public Consumidor(Buffer buffer, String nombre) {
		super();
		this.buffer = buffer;
		this.nombre = nombre;
	}

	@Override
	public void run() {

		int cantProductos;

		while (true) {

			// cada cliente puede tomar a lo sumo 5 productos
			cantProductos = (int) ((Math.random() * 5) + 1);

			buffer.tomarProductos(cantProductos, this.nombre);
			buffer.consumir(cantProductos);
		}

	}

}
