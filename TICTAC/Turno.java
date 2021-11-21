public class Turno
{
    private boolean flag;

    public Turno()
    {
        flag = true;
    }
    /*
    * Cuando el hilo entre en coger, este esperará a que le avise el otro que ha terminado
    * Con esto aseguramos que vayan secuencialmente
    */
    public synchronized void coger() throws InterruptedException
    {
        //si flag es tur, podrá pasar a esperar. Cambiamos la flag para que el siguiente hilo 
        //no pueda entrar y vaya directamente a dejar para que notifique a este que esta esperando
        if (flag)
        {
            flag = !flag;
            wait();
        }
    }
    /*
    * Entra en el metodo dejar, despues de haber sacado por pantalla TIC o TAC. 
    * Cambiamos de valor a flag, para que pueda entrar en coger y se repita el ciclo
    */
    public synchronized void dejar()
    {
        flag = true;
        notify();
    }
}
