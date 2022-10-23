package ObligatorioMonitores;

/**
 *
 * @author asdf
 */
public class Buque extends Thread {

    private Lugares lugares;
    private int i = 0;

    public Buque(Lugares lug) {
        lugares = lug;

    }

    public void run() {

        while (true) {

            if(lugares.buqueLLeno()){
                ir();
                
                volver();   
                System.out.println("___________________________________________");
                lugares.vaciar();
               
                
            }

        }

    }

    public synchronized void ir() {

        System.out.println("El buque esta en funcionamiento.");
        try {
            System.out.println("Los autos viajan por el lado este del río.");
            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                Thread.sleep(100);
            }
            System.out.println();
        } catch (InterruptedException ex) {

        }
        System.out.println("El buque llega a su destino y empieza a desembarcar a los autos.");

    }

    public synchronized void volver() {

        try {
            System.out.println("El buque (vacio) esta de camino al puerto para subir mas autos.");
            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                Thread.sleep(100);
            }
            System.out.println();

        } catch (InterruptedException ex) {

        }
        System.out.println("El buque llego al puerto en espera de autos.");

    }

}
