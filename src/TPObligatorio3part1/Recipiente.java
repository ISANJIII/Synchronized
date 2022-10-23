/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPObligatorio3part1;

import java.util.LinkedList;

/**
 *
 * @author asdf
 */
public class Recipiente {

    private int h = 0, o = 0;
    private int tamanioRecipiente;
    private int cantAtomosH20;

    public Recipiente(int i) {
        //osea cuantos atomos de agua este puede almacenar
        tamanioRecipiente = i;
        cantAtomosH20 = 0;
    }

    public synchronized void almacenarOxigeno() {
        o++;
    }

    public synchronized void almacenarHidrogeno() {
        h++;

    }

    public synchronized boolean Olisto() {
        return (o > 0);
    }

    public synchronized boolean Hlisto() {
        return (h > 0);
    }

    public synchronized boolean generarAgua() {
        boolean seGenero = false;
        //osea minimo hay 2 atomos de hidrogeno y minimo hay por lo menos un atomo de oxigeno
        if (h > 1 && o > 0) {
            seGenero = true;
            System.out.println("Se encuentra 2 atomos de hidrogeno y 1 de oxigeno.");
            h = h - 2;
            o = o - 1;
            cantAtomosH20++;
            if (cantAtomosH20 == tamanioRecipiente) {
                System.out.println("El recipiente se lleno y es envasada para su distribuicion....Se vacia el recipiente. ");
                cantAtomosH20 = 0;
            }

        }
        return seGenero;

    }

   

}
