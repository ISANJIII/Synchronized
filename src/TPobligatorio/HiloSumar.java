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
    
    public static int acum = 0;
    private int max;
    private int[] arr;
    private Datos  d;

    public HiloSumar(int[] arr, int min, int max, Datos dat) {
        this.arr = arr;
        this.min = min;
        this.max = max;
        this.d=dat;

    }

    public void run() {
     int acum=0;
     
        for (int i = min; i <= max; i++) {
//            System.out.println(i);
            acum=acum+arr[i];
        }
        System.out.println(Thread.currentThread().getName()+"   "+acum+" min "+ min+" max "+ max);
        
        d.realizarSuma(acum);
        

    }

 

}