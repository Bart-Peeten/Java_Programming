package collections_voorbeeld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * Created by peetenbart on 12-01-17.
 */
public class TestCollections {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("First");
        c.add("Second");
        c.add("Third");
        c.add("Fourth");

        c.forEach(System.out::println);

        System.out.println();


        // Voorbeeld van een Hashset
        Collection<String> a = new HashSet<>();

        // In een Set komen geen duplicaten voor.
        // De elementen zijn ook niet geordend opgeslagen.
        // Wil je wel geordend opslaan dan moet een LinkedHashSet gebruiken.
        a.add("First");
        a.add("Second");
        a.add("Third");
        a.add("Fourth");
        a.add("First");
        a.add("Second");

        a.forEach(System.out::println);

        System.out.println();

        // Voorbeeld van een TreeSet
        Collection<String> b = new TreeSet<>();

        /* Een treeSet rangschiked live op alfbetische volgorde.
        Dus als er nadien nog iets wordt toegevoegd dan wordt dat live o de juiste plaats inde Set gezet.*/
        b.add("First");
        b.add("Three");
        b.add("Seven");
        b.add("Bart");
        b.add("AAAA");

        b.forEach(System.out::println);
    }
}
