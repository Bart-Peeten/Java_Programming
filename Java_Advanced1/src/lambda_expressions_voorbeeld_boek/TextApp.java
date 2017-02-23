package lambda_expressions_voorbeeld_boek;

/**
 * Created by peetenbart on 25-12-16.
 */
public class TextApp {

    public static void main(String[] args) {

        Text text = new Text("Hello, this is an example of a sentence containing words.");

        System.out.println("*** Words containing 'e' ***");
        text.printFilteredWords(s -> s.contains("e"));

        // Zoals het eerst was.
        text.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.length() > 4;
            }
        });


    }
}
