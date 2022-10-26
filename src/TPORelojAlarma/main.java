
package TPORelojAlarma;

/**
 *
 * @author Cristopher.Ovaillos
 */
public class main {
    
    
    public static void main(String[]args){
        int cantDurmientes=3;
        
        RelojCompartido r= new RelojCompartido(cantDurmientes);
        
        Durmientes[] durm= new Durmientes[cantDurmientes];
        //un hilo durmiente suele levantarse para trabajar en un rango de las 6-8
        Reloj alarma= new Reloj(r);
        
       
        
        for (int i = 0; i < cantDurmientes; i++) {
            durm[i]=new Durmientes(r,false,i);
        }
        alarma.start();
        for (int i = 0; i < cantDurmientes; i++) {
            durm[i].start();
        }
    }
    
}
