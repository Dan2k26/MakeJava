public class TAC extends Thread{

	Turno	t;

	public TAC(Turno t) {
		this.t  = t;
		this.setName("TAC");
	}

	public void run()
	{
		for(int i = 0; i < 25; i++)
		{
			try {
				t.coger();
				System.out.println("TAC");
				Thread.sleep(1000);
				t.dejar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
