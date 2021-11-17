public class Turno
{
    private boolean th1;
    private boolean th2;

    public Turno()
    {
        th1 = true;
        th2 = true;
    }

    public synchronized void coger() throws InterruptedException
    {
        if (th1)
        {
            th1 = false;
            wait();
        }
        else if (th2)
        {
            th2 = false;
            wait();
        }
    }

    public synchronized void dejar()
    {
        if (!th1)
            th1 = true;
        else if (!th2)
            th1 = true;
        notify();
    }
}