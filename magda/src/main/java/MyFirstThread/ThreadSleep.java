package MyFirstThread;

public class ThreadSleep implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Sleep");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception sleep()");
                return;  // lub break
            }
        }
    }
}
/* inna metoda:
try {
while (true) {
            System.out.println("Sleep");
            Thread.sleep(1000);
            }
            }
            catch
 */