package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static IO komentorivi;

    public static void main(String[] args) {

        komentorivi = new Komentorivi(new Scanner(System.in));

        // valikkosilmukka
        while (true) {
            komentorivi.tulosta("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            Peli peli = valitsePeli();
            if (peli == null) {
                break;
            } else {
                aloitaPeli(peli);
            }
        }
    }

    private static Peli valitsePeli() {
        String syote = komentorivi.lue();
        Peli peli = null;
        switch (syote) {
            case "a":
                peli = KPSFactory.luoPelaajaVsPelaaja(new Tuomari(), komentorivi);
                break;
            case "b":
                peli = KPSFactory.luoPelaajaVsTekoaly(new Tuomari(), komentorivi);
                break;
            case "c":
                peli = KPSFactory.luoPelaajaVsParempiTekoaly(new Tuomari(), komentorivi);
                break;
            default:
                break;
        }
        return peli;
    }

    private static void aloitaPeli(Peli peli) {
        komentorivi.tulosta("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        peli.pelaa();
    }
}
