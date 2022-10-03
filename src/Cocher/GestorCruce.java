/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocher;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class GestorCruce {

 //recurso compartido
 private Semaphore semN_S, semO_E, semPasaN, semPasaO;
 private boolean norte, oeste;

 public GestorCruce() {

  semN_S = new Semaphore(1,true);
  semO_E = new Semaphore(0,true);

  semPasaN = new Semaphore(1,true);
  semPasaO = new Semaphore(1,true);
  norte = false;
  oeste = false;
 }

 public void iniciar() {

  estaVerdeN_S();

  estaVerde0_E();

 }

 private void estaVerdeN_S() {

  try {
   System.out.println("antesN");
   semN_S.acquire();
   System.out.println("El semaforo de Norte a Sur esta en verde");
   norte = true;
   Thread.sleep(5000);
   norte = false;
    semPasaN.acquire();
    semPasaN.release();
   System.out.println("El semaforo de Norte a Sur esta en rojo");
   
   semO_E.release();

  } catch (InterruptedException ex) {
  }

 }

 private void estaVerde0_E() {

  try {
     System.out.println("antesO");
   semO_E.acquire();
   System.out.println("El semaforo de Oeste a Este esta en verde");
   oeste = true;
   Thread.sleep(5000);
   oeste = false;
   semPasaO.acquire();
   semPasaO.release();
   System.out.println("El semaforo de Oeste a Este esta en rojo");
   Thread.sleep(1000);
   semN_S.release();

  } catch (InterruptedException ex) {
  }

 }

 public boolean puedePasarN(int coch) {
  boolean retornar = true;
  try {
   semPasaN.acquire();
   
   if (norte) {
     Thread.sleep(1000);
    System.out.println("   pasa el coche "+ coch+" norte a sur.");
    retornar = false;
   }
   semPasaN.release();

  } catch (InterruptedException ex) {
   Logger.getLogger(GestorCruce.class.getName()).log(Level.SEVERE, null, ex);
  }
  return retornar;
 }

  public boolean puedePasarO(int coch) {
  boolean retornar = true;
  try {
   semPasaO.acquire();
   if (oeste) {
     Thread.sleep(1000);
    System.out.println("   pasa el coche "+ coch+" oeste a este");
    retornar = false;
   }
   semPasaO.release();

  } catch (InterruptedException ex) {
   Logger.getLogger(GestorCruce.class.getName()).log(Level.SEVERE, null, ex);
  }
  return retornar;
 }

}
