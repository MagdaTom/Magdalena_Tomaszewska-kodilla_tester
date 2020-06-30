package MyFirstThread;

public class MyThirdThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("My third thread " + i);
        }
    }
}
