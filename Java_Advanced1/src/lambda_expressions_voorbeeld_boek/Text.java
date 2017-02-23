package lambda_expressions_voorbeeld_boek;

/**
 * Created by peetenbart on 25-12-16.
 */
public class Text {
    private String sentence;

    public Text(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords (WordFilter filter){

        for (String w : sentence.split(" ")){
            if (filter.isValid(w)){
                System.out.println(w);
            }
        }
    }

    public String toString(){
        return sentence;
    }
}
