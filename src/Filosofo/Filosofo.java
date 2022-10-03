/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filosofo;

/**
 *
 * @author asdf
 */
public class Filosofo extends Thread {
 private Mesa mesa;
 private int l;
 
 public Filosofo(Mesa m,int lugar){
  mesa=m;
  l=lugar;
  
 }
 public void run(){
  mesa.tomarCuchara(l);
  System.out.println("El filosofo sentado en el lugar "+l+" pudo comer....");
 }
 
}
