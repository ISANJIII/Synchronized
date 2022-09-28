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
public class Printer extends Thread {

 char c;
 int repeat, turno;
 Control control;

 public Printer(char c, int repeat, int turno, Control control) {
  this.c = c;
  this.repeat = repeat;
  this.turno = turno;
  this.control = control;
 }

 @Override
 public void run() {
  for (int i = 0; i < 5; i++) {

   while (!control.esTurno(turno)) {

   }

   for (int j = 0; j < repeat; j++) {
    System.out.print(c);

   }

   control.siguienteTurno();
  }
 }
}
