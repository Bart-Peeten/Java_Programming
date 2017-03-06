package nested_class_oefening1;

/**
 * Created by peetenbart on 06-03-17.
 */
public class Musician {
    public void play(){
        Instrument instrument = new Instrument(); // Maak een instantie van Instrument.
        instrument.makeNoise(); // Call the method makeNoise van de inner class.
    }

    public static class Instrument{ // Dit is de Inner class.
        public void makeNoise(){
            System.out.println("Ta Ta Ta TaTaTa TaTaTA");
        }
    }
}
