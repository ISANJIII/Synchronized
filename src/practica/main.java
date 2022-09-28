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
public class main {
  public static void main(String[] args) {
  // TODO code application logic here
 
  Hilo a= new Hilo("Hilo 1",10);
 
  Hilo b= new Hilo("Hilo 2",1);
 
  a.start();
  b.start();
  
  }
}
