package generieken_oef1_goochelaar;

/**
 * Created by peetenbart on 22-12-16.
 */
public class Hoed<T extends Dier> {
    // Deze class moet de Generieken class zijn
    private T inhoud;
    private boolean eersteKijk;

    public Hoed(T inhoud) {
        eersteKijk = true;
        this.inhoud = inhoud;
    }

    public void getInhoud(){

        System.out.println(inhoud.maakGeluid());
    }
}
