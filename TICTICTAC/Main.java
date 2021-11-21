public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		Turno	turno = new Turno();
		TIC		tic1 = new TIC(turno);
		TIC		tic2 = new TIC(turno);
		TAC		tac = new TAC(turno);
		
		//tenemos un hilo para TIC y TAC 
		tic1.start();
		tac.start();	
		tic2.start();
		//Hasta que no terminen los hilos, no imprimo por pantalla
		tic1.join();
		tic2.join();
		tac.join();
		System.out.println("FIN DEL PROGRAMA");
	}
	/*
	* ACLARACIÓN
	* No se si se podia añadir un hilo mas a el main. He decidido incluirlo
	* ya que me he estado pegando con el codigo todo el finde semana y habia 
	* un fallo a mitad de salida por consola. Después de investigar, por lo que deduje 
	* es que notify estaba notificando al azar un hilo, entonces posiblemente 
	* me podria estar notificando al que no era. 
	* He decidido usar 3 para poder tener el control total de todos y decidir yo
	* que es lo que tiene que hacer cada uno, y en memoria no se va a notar gran cambio
	* ya que los hilos comparten memoria con el proceso principal
	*/
}
