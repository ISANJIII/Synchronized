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
public class main {

 public static void main(String[] args) {
  int total = 5;
  Control c = new Control();
  Divisiones[] cola = new Divisiones[total];

  for (int i = 0; i < total; i++) {
   cola[i] = new Divisiones(i + 1, c, total);
  }

  for (int j = 0; j < total; j++) {
   cola[j].start();
  }

 }
}
