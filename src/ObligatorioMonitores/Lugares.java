
package ObligatorioMonitores;


/**
 *
 * @author asdf
 */
public class Lugares {

    private final int tamanio = 10;

    private int pos = 0;

    public Lugares() {

    }

    public boolean agregar() {

        boolean seAgrego = false;
        if (pos < tamanio) {

            seAgrego = true;

        }
        pos++;

        return seAgrego;
    }

    public boolean buqueLLeno() {
        boolean lleno = false;
        if (pos == tamanio) {
            lleno = true;

        }
        return lleno;
    }

    public int getTamanio() {
        return tamanio;
    }
}
