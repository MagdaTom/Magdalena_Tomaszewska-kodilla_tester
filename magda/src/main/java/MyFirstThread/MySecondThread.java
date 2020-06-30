package MyFirstThread;

public class MySecondThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("This is my second thread " + i);
        }
    }
}

