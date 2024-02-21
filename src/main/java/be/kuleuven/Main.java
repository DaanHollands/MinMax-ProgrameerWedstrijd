package be.kuleuven;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aantalLijsten = input.nextInt();
        StringBuilder output = new StringBuilder();
        for (int lijst = 0; lijst < aantalLijsten; lijst++) {
            int aantalNummers = input.nextInt();
            int[] gelezenNummers = new int[aantalNummers];
            for (int getal = 0; getal < aantalNummers; getal++) {
                if(input.hasNextInt()) {
                    gelezenNummers[getal] = input.nextInt();
                }
            }
            int laagsteNummer = Arrays.stream(gelezenNummers).min().getAsInt();
            int hoogsteNummer = Arrays.stream(gelezenNummers).max().getAsInt();
            output.append((lijst + 1)).append(" ").append(laagsteNummer).append(" ").append(hoogsteNummer).append("\n");
        }
        System.out.println(output);
    }
}
