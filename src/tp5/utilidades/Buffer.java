package tp5.utilidades;

import java.util.concurrent.Semaphore;

public class Buffer {

	private LimitedQueue<Integer> cinta;
	private Semaphore mutex;
	private Semaphore semConsumir;
	private Semaphore semProducir;

	// Constructor
	public Buffer(LimitedQueue<Integer> cinta) {

		this.mutex = new Semaphore(1);
		this.semConsumir = new Semaphore(0);
		this.cinta = cinta;
		this.semProducir = new Semaphore(cinta.getLimite());
	}

	public void almacenar(int producto) {

		boolean almacenado;

		try {

			semProducir.acquire();
			mutex.acquire();

		} catch (Exception e) {
		}

		almacenado = this.cinta.add(producto);

		if (almacenado) {
			System.out.println("El producto (" + producto + ") fue almacenado exitosamente");
			semConsumir.release();
			mutex.release();
		} else {
			System.out.println("Se ve que algo anda mal... :')");
		}
	}

	public int producir() {

		int producto;

		producto = (int) ((Math.random() * 10) + 1);

		return producto;
	}

	public void tomarProductos(int cantidadProductos, String nombreCliente) {

		try {

			semConsumir.acquire(cantidadProductos);
			mutex.acquire();
			System.out.println("---" + cinta + "---");

			for (int i = 0; i < cantidadProductos; i++) {
				cinta.remove();
			}

		} catch (Exception e) {
		}
		System.out.println("---" + cinta + "---");
		System.out.println("El cliente -" + nombreCliente + "- ha consumido (" + cantidadProductos + ") productos");

		semProducir.release(cantidadProductos);

		mutex.release();

	}

	public void consumir(int cantProductos) {

		int tiempoConsumo = 50 * cantProductos;

		try {

			Thread.sleep(tiempoConsumo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
