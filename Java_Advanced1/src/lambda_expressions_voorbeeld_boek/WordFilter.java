package lambda_expressions_voorbeeld_boek;

/**
 * Created by peetenbart on 25-12-16.
 */
@FunctionalInterface
public interface WordFilter {
    public boolean isValid(String s);
}
