/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author asdf
 */
public class Hilo extends Thread {

 private int retraso;

 public Hilo(String a, int num) {
  super(a);
  retraso = num;

 }

 public void run() {
  int i;
  int a=retraso;
  System.out.println(a);
  for (i = 0; i <= 2; i++) {

   try {

    mostrar();

   } catch (InterruptedException e) {

   }

  }

 }

 private void mostrar() throws InterruptedException {
  
  Thread.sleep(retraso * 1000);
  System.out.println(Thread.currentThread().getName());
 }

}
