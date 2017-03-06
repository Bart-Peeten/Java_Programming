package nested_class_oefening2;

/**
 * Created by peetenbart on 06-03-17.
 */
public class Musician {
    public void play(){
        Instrument instrument = new Instrument();
        instrument.makeNoise();
    }

    class Instrument{ // Dit is een lokale Inner class.
        public void makeNoise(){
            System.out.println("TaTaTa TaTaTa Ta Ta Ta");
        }
    }
}
