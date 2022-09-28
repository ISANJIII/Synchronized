/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpObligatorio2;

import java.util.Scanner;

/**
 *
 * @author asdf
 */
public class Ejercicio4 {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  // el num 1 significa hamaca
  Rueda r = new Rueda();
  Plato p=new Plato();
  Hamaca h= new Hamaca();
  
 Jaula jl= new Jaula(h,r,p);
  
  
  
  
  

  Hamster rata1 = new Hamster("Guille", jl);
  Hamster rata2 = new Hamster("Cris", jl);
  Hamster rata3 = new Hamster("Nacho", jl);
  Hamster rata4 = new Hamster("Franco", jl);
  Hamster rata5 = new Hamster("Facu", jl);
  Hamster rata6 = new Hamster("Celi", jl);

  rata1.start();
  rata2.start();
  rata3.start();
  rata4.start();
  rata5.start();
  rata6.start();

 }
}
