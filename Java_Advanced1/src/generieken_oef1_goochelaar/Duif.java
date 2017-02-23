package generieken_oef1_goochelaar;

/**
 * Created by peetenbart on 22-12-16.
 */
public class Duif extends Dier{
    private String duifGeluid = "Roeroe Roeroe Roeroe";

    public Duif() {
    }

    public String getDuifGeluid() {
        return duifGeluid;
    }

    @Override
    String maakGeluid() {
        return getDuifGeluid();
    }
}
