package streaming_voorbeeld;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by peetenbart on 09-03-17.
 */
public class Reducerende_bewerkingen_boek {
    public static void main(String[] args) {
        String[] words = {"Hallo", "Ik", "ben", "Bart"};
        String[] words1 = {"Hallo", "ik"};

        OptionalInt max = IntStream.rangeClosed(0, 45).max();

        if (max.isPresent()){
            System.out.println(max.getAsInt());
        } else {
            System.out.println("No result!!!");
        }

        // Eigen Reducerende methode maken.
        String res = Stream.of(words1)
                .reduce("#", (acc, el) -> acc + el + "*");
        System.out.println("\n" + res);

        int result = IntStream.rangeClosed(1, 3)
                .reduce(4, (acc, el) -> acc * el);
        System.out.println("\n" + result);
    }
}

