package IO_Hfdstk_6;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by peetenbart on 02-02-17.
 */
public class Test_IO {
    public static void main(String[] args) {
        Path p1;
        p1 = Paths.get("/Users/bpeeten/Documents");
        // Resolve is iets toevoegen.
        Path p2 = p1.resolve("dir1");

    }
}
