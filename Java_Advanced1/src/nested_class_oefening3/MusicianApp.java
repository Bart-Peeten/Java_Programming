package nested_class_oefening3;

/**
 * Created by peetenbart on 06-03-17.
 */
public class MusicianApp {
    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.play(new Instrument() {
            @Override
            public void makeNoise(String s) {
                System.out.println(s);
            }
        });

        musician.play(m -> System.out.println(m.toUpperCase()));
    }
}
