/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSynchronized;

import java.util.Scanner;

/**
 *
 * @author asdf
 */
public class Ejercicio4 {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  // el num 1 significa hamaca
  
  Jaula  jl= new Jaula();
  Hamster h1= new Hamster(jl,1);
  Hamster h2= new Hamster(jl,1);
  Hamster h3= new Hamster(jl,1);
  Thread hm1= new Thread(h1," 1 ");
    Thread hm2= new Thread(h2," 2 ");
      Thread hm3= new Thread(h3," 3 ");
      
      hm1.start();
          hm2.start();
              hm3.start();
           
  
  
 }
}
