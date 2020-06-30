package MyFirstThread;

public class ThreadInterruptWithoutSleep implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Thread is working");
            if(Thread.interrupted()){
                System.out.println("Interrupted");
                return;
            }
        }
    }
}
