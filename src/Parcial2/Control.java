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
public class Control {
 private int turno=1;
 
 
 public Control(){
 
 }
 
 public synchronized boolean esSuTurno(int i){
  boolean retornar=true;
  
  if(turno==i){
   retornar=false;
  }
       
  
  
  
  
  return retornar;
 }
 
 public void subirTurno(){
  
  turno++;
  
 }
 
 
 
}
