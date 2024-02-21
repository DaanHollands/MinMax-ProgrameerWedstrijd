package be.kuleuven;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aantalLijsten = input.nextInt();

        for (int lijst = 0; lijst < aantalLijsten; lijst++) {
            int aantalNummers = input.nextInt();
            int[] gelezenNummers = new int[aantalNummers];
            for (int getal = 0; getal < aantalNummers; getal++) {
                if(input.hasNextInt()) {
                    gelezenNummers[getal] = input.nextInt();
                }
            }
            int laagsteNummer = 1001;
            int hoogsteNummer = 0;
            for (int nummer : gelezenNummers) {
                if(laagsteNummer > nummer){
                    laagsteNummer = nummer;
                }
                if (hoogsteNummer < nummer){
                    hoogsteNummer = nummer;
                }
            }
            System.out.println((lijst+1) + " " + laagsteNummer + " " + hoogsteNummer);
        }

    }
}
