/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPobligatorio;

/**
 *
 * @author asdf
 */
public class Datos {
 
 private int i=0;
 
 public synchronized void realizarSuma(int a){
  
  i=i+a;
  
  
 
 }
 
 public int mostrarSuma(){
  return i;
 }
 
 
 
 
}
