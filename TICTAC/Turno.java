public class Turno
{
    private boolean flag;

    public Turno()
    {
        flag = true;
    }
/*
*   Ponemos syncronized porque el wait lo requiere, ya que es como 
*   una puerta a la hora de que entren varios hilos, una vez hay uno
*   parado usando el wait, el otro syncronized debe estar en el notify
*   para saber cuando ha terminado.
*   Coger se encargará de hacer la espera hasta que el otro hilo no haya
*   terminado, asi el podrá imprimir su nombre
*/
    public synchronized void coger() throws InterruptedException
    {
        //Si el hilo que se ejecuta es true, pararemos ese hilo hasta que le 
        //notifiquen, y se despierte. Se cambia la flag antes porque sino
        //ambos se qeudarian esperando a que uno notificasen.
        if (flag)
        {
            flag = !flag;
            wait();
        }
    }

    public synchronized void dejar()
    {
        //Volvemos a ponerla a true, para que pueda entrar en la condicion de arriba
        //y asi espere a el siguiente hilo o llamada de otro hilo y notificamos que 
        //el que estaba esperando puede iniciar de nuevo su ejecucion
        flag = true;
        notify();
    }
}
