
package TPORelojAlarma;

/**
 *
 * @author cristopher.ovaillos
 */
public class main {
    
    
    public static void main(String[]args){
        int cantDurmientes=2;
        
        RelojCompartido r= new RelojCompartido(cantDurmientes);
        
        Durmientes[] durm= new Durmientes[cantDurmientes];
        
        Reloj alarma= new Reloj(r);
        
        
        for (int i = 0; i < cantDurmientes; i++) {
            durm[i]=new Durmientes(r,false);
        }
        alarma.start();
        for (int i = 0; i < cantDurmientes; i++) {
            durm[i].start();
        }
    }
    
}