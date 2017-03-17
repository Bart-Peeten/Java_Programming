package multithreading_with_runnable;

/**
 * Created by peetenbart on 16-03-17.
 */
public class PrinterApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new CharPrinter('#', 100));
        Thread thread1 = new Thread(new CharPrinter('*', 100));

        thread.start();
        thread1.start();
    }
}
