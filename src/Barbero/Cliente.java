package barberoDormilon;

public class Cliente extends Thread {

 private Barberia local;
 public Object c;

 public Cliente(String name, Barberia b) {
  super(name);
  local = b;
 }

 @Override
 public void run() {
  try {
   //BUSCO ASIENTOS..VER EL METODO EN LA CLASE BARBERIA (EXPLICACION)
if(local.buscarAsiento(Thread.currentThread().getName())){
 
//NECESITO EL SEM DE LA SILLA TENGA 1 PERMISO
  local.semSillaOcupar();
   System.out.println(Thread.currentThread().getName() + " Llega a la Barberia.");
   System.out.println("El cliente despierta al barbero para ser atendido");

   local.semHayCliente();
//NECESITO EL SEM BARBERO CON 1 PERMISO QUE INDICARA QUE EL BARBERO YA TERMINO POR LO TANTO LUEGO PODRE LIBERAR LA SILLA PARA QUE OTRO CLIENTE PUEDA SENTARSE
   local.semBarberoAdquirir();

   local.semSillaLiberar();

   System.out.println("El cliente se despide :D");


   System.out.println(" ");
}
  } catch (InterruptedException ex) {
  }

 }

}
