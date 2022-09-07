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

 public class main {
    public static void main(String[] args) {




        Datos a = new Datos(10);
        
        
        System.out.println(a.getDato());
        a.incrementar();
    

        System.out.println(a.getDato());

    }
}

