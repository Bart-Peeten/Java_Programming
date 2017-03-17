package streaming_voorbeeld;

import java.util.stream.IntStream;

/**
 * Created by peetenbart on 09-03-17.
 */
public class Streams_uit_het_boek {
    public static void main(String[] args) {
        IntStream iStream = IntStream.rangeClosed(0, 10);

        iStream.forEach(System.out::println);


        IntStream.iterate(0, i -> i + 1).forEach(System.out::println);
    }
}
