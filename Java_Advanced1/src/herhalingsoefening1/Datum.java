package herhalingsoefening1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by peetenbart on 14-12-16.
 */
public final class Datum {
    private int dag;
    private int maand;
    private int jaar;
    private final String DATESEPERATOR = "/";

    public void Datum(int dag, int maand, int jaar){
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    public Datum(Datum datum) {
        this.dag = datum.getDag();
        this.maand = datum.getMaand();
        this.jaar = datum.getJaar();
    }

    public int getDag() {
        return dag;
    }

    public void setDag(int dag) {
        this.dag = dag;
    }

    public int getMaand() {
        return maand;
    }

    public void setMaand(int maand) {
        this.maand = maand;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public String drukDatum(){
        String datumString = String.format("%s,%s,%s,%s,%s", dag, DATESEPERATOR, maand, DATESEPERATOR, jaar);

        return datumString;
    }
}
