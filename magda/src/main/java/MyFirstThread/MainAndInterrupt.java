package MyFirstThread;

public class MainAndInterrupt {
    public static void main(String[] args) throws InterruptedException {

       Thread thread = new Thread(new ThreadSleep());
       thread.start();

       thread.interrupt();

       Thread.sleep(1000);

        Thread threadInterrupted = new Thread(new ThreadInterruptWithoutSleep());
        threadInterrupted.start();

        Thread.sleep(1000);

        threadInterrupted.interrupt();
        }
    }


