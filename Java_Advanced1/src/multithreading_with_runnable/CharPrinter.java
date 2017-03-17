package multithreading_with_runnable;

/**
 * Created by peetenbart on 16-03-17.
 */
public class CharPrinter implements Runnable {
    private char c;
    private int count;

    public CharPrinter(char c, int count) {
        this.c = c;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++){
            System.out.print(c);
        }
        System.out.println();
    }
}
