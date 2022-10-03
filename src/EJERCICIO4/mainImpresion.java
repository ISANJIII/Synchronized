/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO4;

import java.util.Random;

/**
 *
 * @author asdf
 */
public class mainImpresion {

 public static void main(String[] args) {
  //ingreso la cantidad de impresoras primero la cantidad de IMP-A y luego la cantidad de IMP-B
  Impresora impresora = new Impresora(5, 1);

int totalU=10;
  Usuario[] usuario = new Usuario[totalU];
  
  
  
  
int total= usuario.length;
  for (int i = 0; i < total; i++) {
   
   
   if ((i % 2) == 0) {
    
    usuario[i] = new Usuario('A', impresora);
   } else {
  
    usuario[i] = new Usuario('B', impresora);
   }
   
   
  }
 
  
  for(int j=0;j<total;j++){
   usuario[j].start();
  }
  
  

 }

}
