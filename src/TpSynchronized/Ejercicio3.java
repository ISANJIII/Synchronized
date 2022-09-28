/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSynchronized;

import java.util.Scanner;

/**
 *
 * @author asdf
 */
public class Ejercicio3 {

    /*Una computadora central conectada a terminales remotas vía links de comunicación se
utiliza para realizar reservas de asiento para una sala de concierto.
Para reservar un asiento, un cliente elige un asiento libre y el encargado entra el número
del asiento elegido en la terminal, y genera un ticket si está libre.
Se requiere un sistema que evite que se realicen reservas dobles para un mismo sitio, que
permita que los clientes elijan libremente entre los asientos libres.*/
    public static void main(String[] args) {

        Asiento a = new Asiento(llenarArreglo(10));
        Cliente c4 = new Cliente("Nico", 1, a);
        Cliente c3 = new Cliente("juan", 1, a);
        Cliente c2 = new Cliente("Pedro", 1, a);

        Cliente c5 = new Cliente("Lucas", 1, a);
        Cliente c6 = new Cliente("Claudio", 1, a);
        Thread a2 = new Thread(c2);

        Thread a3 = new Thread(c3);
        Thread a4 = new Thread(c4);
        Thread a5 = new Thread(c5);
        Thread a6 = new Thread(c6);

        a3.start();
        a2.start();
        a4.start();
        a5.start();
        a6.start();

    }

    public static boolean[] llenarArreglo(int tamanio) {

        boolean[] arr = new boolean[tamanio];
        int longitud = arr.length;
        for (int i = 0; i < longitud; i++) {
            arr[i] = false;
        }
        return arr;
    }

}