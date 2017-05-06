/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author Piia Hartikka
 */
public class KPSPelaajaVsParempiTekoaly extends KPSTemplate {

    String[] muisti;
    int vapaaMuistiIndeksi;

    public KPSPelaajaVsParempiTekoaly(Tuomari tuomari, IO io, int muistinKoko) {
        super(tuomari, io);
        muisti = new String[muistinKoko];
        vapaaMuistiIndeksi = 0;
    }

    @Override
    protected String tokanPelaajanSiirto() {
        String palautettava;    
        if (vapaaMuistiIndeksi == 0 || vapaaMuistiIndeksi == 1) {
            palautettava = "k";
            tulostaViesti(palautettava);
            return palautettava;
        }

        palautettava = laskeKannattavaSiirto();
        tulostaViesti(palautettava);
        return palautettava;
    }

    @Override
    public void annaEkanSiirtoTokalle(String siirto) {
        // jos muisti täyttyy, unohdetaan viimeinen alkio
        if (vapaaMuistiIndeksi == muisti.length) {
            for (int i = 1; i < muisti.length; i++) {
                muisti[i - 1] = muisti[i];
            }

            vapaaMuistiIndeksi--;
        }

        muisti[vapaaMuistiIndeksi] = siirto;
        vapaaMuistiIndeksi++;
    }
    
    private void tulostaViesti(String viesti) {
        io.tulosta("Tietokone valitsi: " + viesti);
    }
    
    private String laskeKannattavaSiirto() {
        String viimeisinSiirto = muisti[vapaaMuistiIndeksi - 1];

        int k = 0;
        int p = 0;
        int s = 0;

        for (int i = 0; i < vapaaMuistiIndeksi - 1; i++) {
            if (viimeisinSiirto.equals(muisti[i])) {
                String seuraava = muisti[i + 1];

                if ("k".equals(seuraava)) {
                    k++;
                } else if ("p".equals(seuraava)) {
                    p++;
                } else {
                    s++;
                }
            }
        }

    // Tehdään siirron valinta esimerkiksi seuraavasti;
        // - jos kiviä eniten, annetaan aina paperi
        // - jos papereita eniten, annetaan aina sakset
        // muulloin annetaan aina kivi
        if (k > p && k > s) {
            return "p";
        } else if (p > k && p > s) {
            return "s";
        } else {
            return "k";
        }
    }

}
