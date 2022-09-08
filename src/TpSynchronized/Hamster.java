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
public class Hamster implements Runnable {

 private Jaula jl = new Jaula();
 private int tipo;

 public Hamster(Jaula j, int t) {
  jl = j;
  tipo = t;
 }

 @Override
 public void run() {

  try {

   reservar(tipo);
   Thread.sleep(1000);

  } catch (InterruptedException e) {

  }

 }

 private synchronized void reservar(int tipo) {
  //realizar la reserva de unos de los tipos de los elementos de la jaula es una seccion critica

  /*
  1: hamaca
  2: rueda
  3: plato
   */
  
  switch (tipo) {
   case 1:
    //no esta reservada
    if (!jl.isHamaca()) {
     jl.ocuparHamaca();
     System.out.println(Thread.currentThread().getName());
    }else{
     System.out.println("bbbbb");
    }
    
    

    ;
    break;
   case 2: 
    ;
    break;
   case 3: 
    ;
    break;

  }

 }

}
