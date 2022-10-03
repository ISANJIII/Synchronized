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
public class clase1 extends Thread {
 
 private boolean atributo1;
private int pos;
 public clase1(int i){
  pos=i;
  
  atributo1 = (i%2)==0;
  
 }
 
 public void run(){
  getVariable();
  
  
 }
 
 public synchronized void getVariable(){
  System.out.println(pos+" tiene la variable "+atributo1);
  
 }
 
 
 
 
}
