package streaming_voorbeeld;

import java.util.stream.Stream;

/**
 * Created by peetenbart on 12-01-17.
 */
public class TestStream {
    public static void main(String[] args) {
        String[] words = {"Hallo", "Ik", "ben", "Bart"};

        // Zo was het eerst.
        for (String s : words) {
            System.out.println(s);
        }

        System.out.println();

        // Nu met Streams.
        Stream.of(words).forEach(System.out::println);

        System.out.println();

        // Met meerdere statements in de stream.
        Stream.of(words).filter(s -> s.contains("a"))
                        .forEach(System.out::println);

        System.out.println();

        Stream.of(words).mapToInt(s -> s.length())
                        .forEach(System.out::println);

        System.out.println();

        int[] intArray = Stream.of(words).mapToInt(s -> s.length())
                                         .toArray();
        //Stream.of(intArray).forEach(System.out::println);
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
