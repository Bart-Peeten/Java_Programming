package nested_class_oefening5_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by peetenbart on 06-03-17.
 */
public class Text {
    private String sentence;
    private Consumer<String> consumer;

    public Text(String sentence, Consumer<String> consumer) {
        this.sentence = sentence;
        this.consumer = consumer;
    }

    public void printFilteredWords(Predicate<String> predicate) {
        for (String w : sentence.split(" ")) {
            if (predicate.test(w)) {
                consumer.accept(w);
            }
        }
    }

    public void printProcessedWords(Function<String, String> processor) {
        for (String w : sentence.split(" ")) {
            consumer.accept(processor.apply(w));
        }
    }

    public void printSum(Function<String, Double> numberParser) {
        double number = 0;
        for (String w : sentence.split(" ")) {
            number += numberParser.apply(w);
        }
        consumer.accept("Totaal = " + number);
    }

    public String toString() {
        return sentence;
    }

    public Consumer<String> getConsumer() {
        return consumer;
    }
}
