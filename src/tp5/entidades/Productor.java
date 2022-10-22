package tp5.entidades;

import tp5.utilidades.Buffer;

public class Productor implements Runnable {

	private Buffer buffer;

	public Productor(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {

		int producto;

		while (true) {
			
			producto = buffer.producir();
			buffer.almacenar(producto);
			
		}

	}

	

}
