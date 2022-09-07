/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPobligatorio;

/**
 *
 * @author asdf
 */
public  class HiloSumar extends Thread {

    /**
     * @param args the command line arguments
     */
    private int min;
    private int acumActual =0;
    public static int acum = 0;
    private int max;
    private int[] arr;

    public HiloSumar(int[] arr, int min, int max) {
        this.arr = arr;
        this.min = min;
        this.max = max;

    }

    public void run() {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
            sumar(arr[i]);
        }

    }

    public synchronized void sumar(int valor){
        acum = acum + valor;
    }

}