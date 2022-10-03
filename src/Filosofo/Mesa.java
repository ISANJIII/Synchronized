/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filosofo;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author asdf
 */
public class Mesa {

 private final int total = 5;
 private Semaphore[] cucharas = new Semaphore[total];

 public Mesa() {
  for (int i = 0; i < total; i++) {
   cucharas[i] = new Semaphore(1);
  }
 }

 public void tomarCuchara(int lugar) {
  Random x = new Random();
  //rango de 0...1
  int i = x.nextInt(2);
  //empiezo tomando izquierda
  if (i == 0) {
   if (lugar == 0) {
    
    tomarCucharaIzq(4);
    System.out.println("pudo tomar la cuchara izquierda "+ lugar);
    
    tomarCucharaDer(lugar + 1);
       System.out.println("pudo tomar la cuchara derecha "+ lugar);
   } else {
    tomarCucharaIzq(lugar - 1);
      System.out.println("pudo tomar la cuchara izquierda "+ lugar);
    tomarCucharaDer((lugar + 1) % total);
       System.out.println("pudo tomar la cuchara derecha "+ lugar);
   }

  }//empiezo tomando derecha
  else {
   if (lugar == 0) {

    tomarCucharaDer(lugar + 1);
       System.out.println("pudo tomar la cuchara derecha "+ lugar);
    tomarCucharaIzq(4);
      System.out.println("pudo tomar la cuchara izquierda "+ lugar);
   } else {

    tomarCucharaDer((lugar + 1) % total);
       System.out.println("pudo tomar la cuchara derecha "+ lugar);
    tomarCucharaIzq(lugar - 1);
      System.out.println("pudo tomar la cuchara izquierda "+ lugar);
   }

  }
 }

 private void tomarCucharaIzq(int i) {
  try {

   cucharas[i].acquire();

  } catch (InterruptedException e) {

  }

 }

 private void tomarCucharaDer(int i) {
  try {

   cucharas[i].acquire();

  } catch (InterruptedException e) {

  }

 }

}
