package nested_class_oefening5_lambda;

/**
 * Created by peetenbart on 06-03-17.
 */
public interface TextUtil {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
