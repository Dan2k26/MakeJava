public class TOE extends Thread{

	Turno	t;

	public TOE(Turno t) {
		this.t  = t;
		this.setName("TOE");
	}

	public void run()
	{
		for(int i = 0; i < 25; i++)
		{
			try {
				t.coger();
				System.out.println("TOE");
				Thread.sleep(1000);
				t.dejar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}