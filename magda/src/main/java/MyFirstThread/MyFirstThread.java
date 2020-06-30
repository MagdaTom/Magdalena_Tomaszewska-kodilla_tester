package MyFirstThread;

public class MyFirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("This is my first thread " + i);
        }
    }
}
