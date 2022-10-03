/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO4;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asdf
 */
public class Impresora {

 private int cantA, cantB;
 private int posColeccionA = 0, posColeccionB = 0;
 private Semaphore darPermisoA, darPermisoB;
 private Semaphore quitarPermisoA, quitarPermisoB;
 private Semaphore[] semImpresoraA, semImpresoraB;
 //la pos 0 para impresora A y 1 para ImpresoraB
 private boolean[] hayLibre = new boolean[2];
 private int cod;
//con esto indico la cantidad de impresoras de tipo A y B que hay

 public Impresora(int cantA, int cantB) {

  darPermisoA = new Semaphore(1);
  darPermisoB = new Semaphore(1);
 
  quitarPermisoA = new Semaphore(1);
  quitarPermisoB = new Semaphore(1);
  
  //INICIO NUESTAS VARIABLES
  this.cantA = cantA;
  this.cantB = cantB;
  hayLibre[0] = true;
  hayLibre[1] = true;
  //GENERO EL ARREGLO
  semImpresoraA = new Semaphore[cantA];
  semImpresoraB = new Semaphore[cantB];
  //LE DOY UN PERMISO A CADA IMPRESORA
  boolean bA = true, bB = true;
  int a = 0, b = 0;
  while (bA || bB) {
   if (a < cantA) {
    semImpresoraA[a] = new Semaphore(1);
   } else {
    bA = false;
   }
   if (b < cantB) {
    semImpresoraB[b] = new Semaphore(1);
   } else {
    bB = false;
   }
   a++;
   b++;
  }

 }

 public int SolicitarPermiso(char tipo) {
  int retornarPos;
  if (tipo == 'A') {

   retornarPos = solicitarPermisoA();

  } else {

 
    retornarPos = solicitarPermisoB();
  

  }
  return retornarPos;
 }

 private int solicitarPermisoA() {

  boolean tienePermiso = true;
  //retorno la posicion dentro del arreglo del semaforo el cual pedi permiso
  int retornarPos = -1;

  try {
   //aca

   while (tienePermiso) {
    darPermisoA.acquire();

    if (semImpresoraA[posColeccionA].availablePermits() != 0) {
     semImpresoraA[posColeccionA].acquire();
     retornarPos = posColeccionA;
     tienePermiso = false;

    }

    posColeccionA = ((posColeccionA + 1) % cantA);

    darPermisoA.release();
   }

  } catch (InterruptedException ex) {
   Logger.getLogger(Impresora.class.getName()).log(Level.SEVERE, null, ex);
  }

  return retornarPos;
 }



 private int solicitarPermisoB() {

  boolean tienePermiso = true;
  //retorno la posicion dentro del arreglo del semaforo el cual pedi permiso
  int retornarPos = -1;

  try {
   //aca

   while (tienePermiso) {
    darPermisoB.acquire();

    if (semImpresoraB[posColeccionB].availablePermits() != 0) {
     semImpresoraB[posColeccionB].acquire();
     retornarPos = posColeccionB;
     tienePermiso = false;

    }

    posColeccionB = ((posColeccionB + 1) % cantB);

    darPermisoB.release();
   }

  } catch (InterruptedException ex) {
   Logger.getLogger(Impresora.class.getName()).log(Level.SEVERE, null, ex);
  }

  return retornarPos;
 }

 public void yaTermineDeUsarLaImpresoraA(int imp, char tipo) {

  try {
   quitarPermisoA.acquire();
   if (tipo == 'A') {
    semImpresoraA[imp].release();
    hayLibre[0] = true;
   }

   quitarPermisoA.release();
  } catch (InterruptedException ex) {
   Logger.getLogger(Impresora.class.getName()).log(Level.SEVERE, null, ex);
  }

 }

 public void yaTermineDeUsarLaImpresoraB(int imp, char tipo) {

  try {
   quitarPermisoB.acquire();

   if (tipo == 'B') {
    semImpresoraB[imp].release();
    hayLibre[1] = true;
   }
   quitarPermisoB.release();
  } catch (InterruptedException ex) {
   Logger.getLogger(Impresora.class.getName()).log(Level.SEVERE, null, ex);
  }

 }


}
