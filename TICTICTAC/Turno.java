public class Turno
{
    private boolean flag1;
    private boolean flag2;

    public Turno()
    {
        flag1 = true;
        flag2 = true;
    }
    /*
    * Vamos a tener dos flags para saber cual es el que tenmos que parar
    * Cuando flag1 este true, cambiaremos a false para el siguiente, pero
    * este entrará en flag 2, ya que es true esa flag, y la pondrá a false mientras espera
    */
    public synchronized void coger() throws InterruptedException
    {
        if (flag1)
        {
            flag1 = !flag1;
            wait();
        }
        else if (flag2)
        {
            flag2 = !flag2;
            wait();
        }
    }
    /*
    * Una vez entra en dejar, entrará en flag1 ya que la tiene a falsa y cambiara a true
    * para que pueda empezar el ciclo de nuevo con coger. Lo mismo pasará con flag2
    * y notificará a los hilos
    */
    public synchronized void dejar() throws InterruptedException
    {
        if (!flag1)
            flag1 = true;
        else if (!flag2)
            flag2 = true;
        notify();
    }
}
