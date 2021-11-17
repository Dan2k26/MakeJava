public class Main
{
	public static void main(String[] args)
	{
		Turno	turno = new Turno();
		TIC		tic = new TIC(turno);
		TAC		tac = new TAC(turno);
		TOE		toe = new TOE(turno);

		tic.start();
		tac.start();
		toe.start();
		
	}
}