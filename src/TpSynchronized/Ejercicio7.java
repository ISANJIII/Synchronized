/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSynchronized;

/**
 *
 * @author asdf
 */
public class Ejercicio7 {
    
    private static final int PRINTERS_AMOUNT = 3; 

    public static void main(String[] args) throws InterruptedException 
    {
        Printer[] printers = new Printer[PRINTERS_AMOUNT];
        Control control = new Control();

        printers[0] = new Printer('A', 1, 0, control);
        printers[1] = new Printer('B', 1, 2, control);
        printers[2] = new Printer('C', 1, 1, control);
    
        for(int i=0; i<PRINTERS_AMOUNT; i++)
            printers[i].start();

        for(int i=0; i<PRINTERS_AMOUNT; i++)
            printers[i].join();

        System.out.println();
    }
}
