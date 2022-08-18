/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente;

/**
 *
 * @author cristopher.ovaillos
 */
public class Uno {

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            //valor 1
            valor = valor + Integer.parseInt("w");

            //valor 43
            valor = valor + 1;
            //valor 44
            System.out.println("Valor al final del try:" + valor);

            //valor de 44
        } catch (NumberFormatException e) {
            //si no hubo ninguna excepcion nada pero si hubiera una excepcion 45
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);

        } finally {

            //si no hubiera una excepcion 45
            //hubiera una excepcion 46
            valor = valor + 1;
            System.out.println("Valor al final del finally:  " + valor);

        }
        //si no hubiera una excepcion 45
        //hubiera una excepcion 47
        valor = valor + 1;
        System.out.println("Valor antes del return : " + valor);
        return valor;

    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            /*
            printStackTrace( ) Se utiliza para imprimir el registro del stack donde se ha iniciado la excepción. 
            toString( ) Se utiliza para mostrar el nombre de una excepción junto con el mensaje que devuelve getMessage().
             */
            e.printStackTrace();
        }
    }

}
