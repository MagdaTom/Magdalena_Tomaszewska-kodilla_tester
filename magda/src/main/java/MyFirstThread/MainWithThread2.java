package MyFirstThread;

public class MainWithThread2 {
    public static void main(String[] args) {


        Thread thread = new Thread(new MyThirdThread());
        thread.start();

        Thread thread2 = new Thread(new Runnable() {//klasa anonimowa
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("From anonymous Class " + i);
                }
            }
        });
        thread2.start();

        new Thread(new Runnable() { //bez przypisywania zmiennej
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Another way " + i);
                }
            }
        }).start();

    }
}
