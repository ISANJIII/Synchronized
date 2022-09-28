/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPobligatorio;

import java.util.Random;

/**
 *
 * @author asdf
 */
public class mainSuma {

 public static void main(String[] args) {
  int[] arreglo = new int[51121];
  llenarArreglo(arreglo);
  //mostrarArr(arreglo);
  Datos d = new Datos();
  HiloSumar[] arrHilos = new HiloSumar[6];

  llenarHilo(arrHilos, arreglo, d);

  activarHilos(arrHilos);
int tamanio= arreglo.length;

  
  System.out.println("Acum: " + d.mostrarSuma());
 mostrarSuma(arreglo);
 }

 public static void activarHilos(HiloSumar[] arr) {
  int lg = arr.length - 1;

  for (int i = 0; i <= lg; i++) {
   arr[i].start();

  }
  try {
   for (int j = 0; j <= lg; j++) {
    arr[j].join();
   }
  } catch (InterruptedException e) {

  }

 }

 public static void llenarHilo(HiloSumar[] arr, int[] arrNum, Datos dat) {
  // precondicion: arrNum.length | arr.length
  int longitud = arr.length;
  int min = 0;
  int max = (arrNum.length / (longitud));
  int salto = max;
int i=0;
  do{
 if(i==longitud-1){
max = arrNum.length;
 }
   arr[i] = new HiloSumar(arrNum, min, max - 1, dat);

   min = max;
   
    max = max + salto;
   
   
   
   
   
   
   
i++;
  }while(i<longitud);

 }

    public static void mostrarSuma(int[] arr){
        //verificador
        int acum = 0;
        for (int i = 0; i< arr.length; i++){
            acum = acum + arr[i];
        }
        System.out.println("SUMA TOTAL: "+acum);
    }
 public static void llenarArreglo(int[] arr) {
  int longitud = arr.length;
  for (int i = 0; i < longitud; i++) {
   Random x = new Random();
   arr[i] = x.nextInt(10);

  }
 }
}
