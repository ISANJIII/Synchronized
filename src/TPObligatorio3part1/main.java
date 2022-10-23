/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPObligatorio3part1;

/**
 *
 * @author asdf
 */
public class main {

    public static void main(String[] args) {
        Recipiente r = new Recipiente(2);
        Generador gen = new Generador(r);

        Atomos at = new Atomos(r);
        gen.start();
        at.start();
    }
}
