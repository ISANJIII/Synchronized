/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 *
 * @author Cristopher.Ovaillos
 */
public class Divisiones extends Thread {

 private Control c;
 private int numDiv;
 private int total;

 public Divisiones(int i, Control c, int total) {
  numDiv = i;
  this.total = total;
  this.c = c;
 }

 public void run() {
  int turno = numDiv;

  for (int i = 0; i < 2; i++) {

   while (c.esSuTurno(turno)) {
   }

   System.out.println("Division " + numDiv + ": oracion " + turno);

   turno = (total * 2 + 1) - turno;
   c.subirTurno();
  }

 }

}
