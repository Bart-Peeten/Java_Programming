package nested_class_oefening4_lambda;

import java.util.function.Predicate;

/**
 * Created by peetenbart on 06-03-17.
 */
public class TextApp {
    public static void main(String[] args) {
        Text text = new Text("Hello this is an example sentence.");

        // Toont alle woorden die een 'e' bevatten
        text.printFilteredWords(new Predicate<String>() {

            @Override
            public boolean test(String word) {
                return word.contains("e");
            }
        });

        System.out.println("");

        // Toont alle woorden die beginnen met 't'
        text.printFilteredWords(new Predicate<String>() {

            @Override
            public boolean test(String word) {
                return word.startsWith("t");
            }
        });

        System.out.println("=======Lambda=======");

        // Lambda expressions die hetzelfde doet als de dikke blok code erboven
        text.printFilteredWords(word -> word.contains("e"));
        System.out.println("");
        text.printFilteredWords(word -> word.startsWith("t"));
    }
}
