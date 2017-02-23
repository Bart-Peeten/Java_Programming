package multithreading_test_hfdstk9;

/**
 * Created by peetenbart on 16-02-17.
 */
public class PrintApp {
    public static void main(String[] args) {
        PrintThread myThread1 = new PrintThread('*', 100);
        PrintThread myThread2 = new PrintThread('#', 100);

        myThread1.start();
        myThread2.start();
    }
}
