package nested_class_oefening4b;

/**
 * Created by peetenbart on 06-03-17.
 */
public class MusicianApp {
    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.play(s -> {
            System.out.println();
        });
    }
}
