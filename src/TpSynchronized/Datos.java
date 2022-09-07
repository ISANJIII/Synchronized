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
public class Datos {

 private int dato;

 public Datos(int nro) {
  dato = nro;
 }

 public synchronized int getDato() {
  return dato;
 }


 public synchronized void incrementar() {
 dato ++;
 }

 public synchronized void set(int valor) {
  dato = valor;
 }

}
