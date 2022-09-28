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
public class Control {
    
    private int turno;
  

    public Control()
    {

        this.turno = 0;
    }

    public synchronized boolean esTurno(int i)
    {
        return turno == i;
    }

    public  void siguienteTurno()
    {
        turno++;
        if(turno >= 3)
            turno = 0;
    }
}