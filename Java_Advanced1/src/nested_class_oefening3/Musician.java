package nested_class_oefening3;

import com.sun.jdi.InterfaceType;

/**
 * Created by peetenbart on 06-03-17.
 */
public class Musician {
    /*public void play() {
        Instrument instrument = new Instrument() { //Instantie van een Anoniem geneste class Instrument.
            @Override
            public void makeNoise() { // Implementeer de methode "makeNoise" van de Interface Instrument.
                System.out.println("TaTaTaTa TaTaTa TaTa Ta");
            }
        };
        }*/

    public void play(Instrument instrument){
        instrument.makeNoise("sdvdfvvsbb");
    }

        //instrument.makeNoise();

}
