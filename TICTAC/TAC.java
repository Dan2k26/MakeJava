public class TAC extends Thread{

	Turno	t;
/*
*	La clase turno va a ser comun para ambos por lo que si hay
*	si hay algun cambio en un atributo de la clase, cambiará
*	para el otro
*/
	public TAC(Turno t) {
		this.t  = t;
		this.setName("TAC");
	}
/*
*	Segun hagan un start a el hilo, este vendrá a la clase run
*	la cual ejecutará el hilo 
*/
	public void run()
	{
		for(int i = 0; i < 25; i++)
		{
			try {
				t.coger();
				System.out.println("TAC");
				//imprimimos despues de la impresion para que la
				//ejecucion en la clase turno no se vea alterada
				Thread.sleep(1000);
				t.dejar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
