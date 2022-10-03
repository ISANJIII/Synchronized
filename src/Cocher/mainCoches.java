/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocher;

/**
 *
 * @author asdf
 */
public class mainCoches {

 public static void main(String[] args) {
  int totalAN = 10;
  GestorCruce g = new GestorCruce();
  Semaforo sem = new Semaforo(g);
  sem.start();

  CochesN_S[] ns = new CochesN_S[totalAN];
  CochesO_E[] oe = new CochesO_E[totalAN];
  for (int i = 0; i < totalAN; i++) {
   ns[i] = new CochesN_S(i, g);
   oe[i] = new CochesO_E(i, g);

  }

  for (int j = 0; j < totalAN; j++) {
   ns[j].start();
   oe[j].start();

  }

 }

}
