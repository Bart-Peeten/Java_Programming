package nested_class_oefening4_lambda;

import java.util.function.Predicate;

/**
 * Created by peetenbart on 06-03-17.
 */
public class Text {
    private String sentence;

    public Text(String sentence) {
        this.sentence = sentence;
    }

    // Deze methode splits een zin op in alle woorden van
    // die zin om makkelijk elk woord van die zin te controleren via een string input.
    public void printFilteredWords(Predicate<String> filter) {
        for(String word :  sentence.split(" ")) {
            if(filter.test(word)) {
                System.out.println(word);
            }
        }
    }
}
