package generieken_oef1_goochelaar;

import java.util.Random;

/**
 * Created by peetenbart on 22-12-16.
 */
public class Goochelaar {

    public static void main(String[] args) {
        Hoed<? extends Dier> hoed;
        Random rand = new Random();

        hoed = selectHoedInhoud(rand);

        hoed.getInhoud();
    }

    private static Hoed<? extends Dier> selectHoedInhoud(Random rand) {
        Hoed<? extends Dier> hoed;
        if (rand.nextInt(10)%2 != 0) {
            hoed = new Hoed<Konijn>(new Konijn());
        }else {
            hoed = new Hoed<Duif>(new Duif());
        }
        return hoed;
    }
}
