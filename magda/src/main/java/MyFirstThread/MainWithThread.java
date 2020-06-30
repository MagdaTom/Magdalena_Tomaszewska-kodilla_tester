package MyFirstThread;

public class MainWithThread {
    public static void main(String[] args) {


        MyFirstThread myFirstThread = new MyFirstThread();
        MySecondThread mySecondThread = new MySecondThread();//moze tez byc Thread mySecond Thread =
        myFirstThread.start();
        mySecondThread.start();
    }
}