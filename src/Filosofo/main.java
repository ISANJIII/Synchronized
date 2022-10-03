/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filosofo;

import java.util.Random;

/**
 *
 * @author asdf
 */
public class main {

 public static void main(String[] args) {
Mesa m= new Mesa();
Filosofo[] filosofos= new Filosofo[5];

for(int i=0;i<5;i++){
 
 filosofos[i]= new Filosofo(m,i);
 
 
}

for(int i=0;i<5;i++){
 
 filosofos[i].start();
 
 
}
  

 }

}
