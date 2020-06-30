package MyFirstThread;

public class MainThreadIsAlive {
    public static void main(String[] args) {
        System.out.println("START");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Hard work");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        System.out.println("Is it alive? " + thread.isAlive());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is is still alive? " + thread.isAlive());
        System.out.println("STOP");
    }
}
