package streaming_voorbeeld;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by peetenbart on 09-03-17.
 */
public class Opdracht1_boek {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0 , 100);
        int[] intArray = IntStream.range(0, 100).toArray();

        for (int i : intArray) {
            System.out.printf(" %d ", i);
        }

        System.out.println();

        // Print het kwadraat van al de gehele getallen.
        intStream.map(d -> d * d).forEach(i -> System.out.printf(" %d ", i));


        String[] tekenreeks = {"*", "%", "$", "#", "@", "!"};
        Stream.of(tekenreeks).forEach(System.out::println);


    }
}
