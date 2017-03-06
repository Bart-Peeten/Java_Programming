package nested_class_oefening1;

/**
 * Created by peetenbart on 06-03-17.
 */
public class MusicianApp {
    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.play();

        Musician.Instrument instrument = new Musician.Instrument();
        instrument.makeNoise();
    }
}
