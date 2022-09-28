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
public class Auto extends Thread {
 
 private int patente;
 private int modelo;
 private String marca;
 private double km;

 protected Auto(int patente, int modelo, String marca, double km) {
  this.patente = patente;
  this.modelo = modelo;
  this.marca = marca;
  this.km = km;
 }
 
 public void run(){
  
  
  
 }
 
 
 
 
 
}
