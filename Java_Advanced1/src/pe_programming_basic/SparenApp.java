package pe_programming_basic;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by peetenbart on 19-02-17.
 */
public class SparenApp {
    public static void main(String[] args) {
        double gespaardBedrag;
        double intrestVoet;
        double intrestBedrag;
        double jaarGespaardBedrag;
        double totaalTeGoed = 0;
        double[] jaarKapitaal = new double[20];
        double[] interesten = new double[20];

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Geef uw maandelijks spaarbedrag in: ");
            gespaardBedrag = in.nextDouble();
            System.out.print("Geef uw intrestvoet in: ");
            intrestVoet = in.nextDouble();
        } while (gespaardBedrag <= 0 || intrestVoet <= 0);
        // Herhalingslus omdat het bedrag groter dan 0 moet zijn.

        jaarGespaardBedrag = gespaardBedrag * 12;
        System.out.println("Het jaarlijks te sparen bedrag is " + jaarGespaardBedrag + "\n");
        for (int j = 0; j <= 1; j++) {
            if (j == 0) {
                System.out.println("Per gespaard jaar:");
                String jaar = "Jaar";
                String bedrag = "Gespaard bedrag";
                String interest = "Interesten";
                String tegoed = "Totaal tegoed";
                System.out.printf("%-16s %-18s %-15s %-15s\n", "Jaar", "Gespaard bedrag", "Interesten", "Totaal tegoed");

                for (int i = 0; i < jaarKapitaal.length; i++) {
                    jaarKapitaal[i] = jaarGespaardBedrag;
                    jaarKapitaal[i] = jaarGespaardBedrag + totaalTeGoed;
                    intrestBedrag = jaarKapitaal[i] * (intrestVoet / 100);
                    interesten[i] = intrestBedrag;
                    totaalTeGoed = jaarKapitaal[i] + intrestBedrag;
                    SparenApp.druk(i + 1, jaarKapitaal[i], interesten[i], totaalTeGoed);
                }
            }else{
                System.out.println("\nPer 2 gespaarde jaren:");
                System.out.println("Jaar\t\t\t Gespaard bedrag\tIntresten\t\tTotaal Tegoed");

                for (int i = 1; i < jaarKapitaal.length; i+=2) {
                    totaalTeGoed = jaarKapitaal[i] + interesten[i];
                    SparenApp.druk(i + 1, jaarKapitaal[i], interesten[i], totaalTeGoed);
                }
            }
        }
        in.close();
    }


    public static void druk(int aantal, double jaarKapitaal, double interesten, double totaalTegoed) {
        String string = "Na " + aantal + " jaar";
        System.out.printf("%-16s %-18.2f %-15.2f %.2f\n", string, jaarKapitaal, interesten, totaalTegoed);
    }

    }

