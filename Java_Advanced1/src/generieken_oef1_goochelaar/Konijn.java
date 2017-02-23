package generieken_oef1_goochelaar;

/**
 * Created by peetenbart on 22-12-16.
 */
public class Konijn extends Dier {
    private String konijnString = "Snif snif snif";

    public Konijn() {

    }

    public String getKonijnString() {
        return konijnString;
    }

    @Override
    String maakGeluid() {
        return getKonijnString();
    }
}
