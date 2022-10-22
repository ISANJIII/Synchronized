package tp5.utilidades;

import java.util.LinkedList;

@SuppressWarnings("serial")
public class LimitedQueue<E> extends LinkedList<E> {

	private int limite;

	public LimitedQueue(int limite) {
		super();
		this.limite = limite;
	}

	public int getLimite() {
		return limite;
	}

	public boolean add(E obj) {

		boolean resultado;

		if (this.size() <= limite) {

			super.add(obj);

			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;

	}

}
