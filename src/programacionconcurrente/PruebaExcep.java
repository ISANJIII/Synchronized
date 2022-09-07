/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author asdf
 */
public class PruebaExcep {
// a. Escriba un método que ingrese la edad de una persona y dispare una excepción si la persona es menor de edad.

 public static void main(String[] args) {

  int edad;

  System.out.println("Ingrese la edad de la persona");
  Scanner sc = new Scanner(System.in);
  edad = sc.nextInt();
  try {
   if (edad >= 0 && edad <= 18) {
    //lanzo una excepcion
    throw new edadExcepcion("menor de edad");
   }
   // las excepciones tienen que ser capturadas por lo tanto hago catch(...)
  } catch (edadExcepcion e) {
// e tiene el mensaje "menor de edad"
   System.out.println(e.getMessage());
  }
  System.out.println("FIN");

 }
 

}
