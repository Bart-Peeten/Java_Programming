package multithreading_test_hfdstk9;


/**
 * Created by peetenbart on 16-02-17.
 */
public class PrintThread extends Thread {
    private char c;
    private int count;

    public PrintThread(char c, int count) {
        this.c = c;
        this.count = count;
    }

    public void run(){
        for (int i = 0; i < count; i++){
            System.out.print(c);
        }
    }
}
