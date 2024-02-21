package be.kuleuven;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aantalLijsten = input.nextInt();

        for (int i = 0; i < aantalLijsten; i++) {
            int aantalNummers = input.nextInt();
            int[] gelezenNummers = new int[aantalNummers];
            Arrays.fill(gelezenNummers,aantalNummers);
            for (int j = 0; j < aantalNummers; j++) {
                if(input.hasNextInt()) {
                    gelezenNummers[j] = input.nextInt();
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
            System.out.println((i+1) + " " + laagsteNummer + " " + hoogsteNummer);
        }

    }
}
