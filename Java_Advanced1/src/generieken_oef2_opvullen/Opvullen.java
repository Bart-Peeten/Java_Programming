package generieken_oef2_opvullen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peetenbart on 10-01-17.
 */
public class Opvullen {
    private List myList = new ArrayList<>();

    public static void main(String[] args) {
        Opvullen opvullen = new Opvullen();
        opvullen.vulLijst("B");

        System.out.println(opvullen.myList);
    }

    private <T> void vulLijst(T value){
        for (int i = 0; i < 20; i++){
            myList.add(value);
        }
    }
}
