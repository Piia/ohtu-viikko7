package ohtu.kivipaperisakset;

// Tuomari pitää kirjaa ensimmäisen ja toisen pelaajan pisteistä sekä tasapelien määrästä.
public class Tuomari {

    private Pisteenlasku pisteet;

    public Tuomari() {
        this.pisteet = new Pisteenlasku();
    }

    public void kirjaaSiirto(String ekanSiirto, String tokanSiirto) {
        if (tasapeli(ekanSiirto, tokanSiirto)) {
            pisteet.tasapeli();
        } else if (pelaaja1Voittaa(ekanSiirto, tokanSiirto)) {
            pisteet.pistePelaajalle1();
        } else {
            pisteet.pistePelaajalle2();
        }
    }

    public String raportoi() {
        return pisteet.raportti();
    }

    // sisäinen metodi, jolla tarkastetaan tuliko tasapeli
    private static boolean tasapeli(String eka, String toka) {
        return eka.equals(toka);
    }

    // sisäinen metodi joka tarkastaa voittaako eka pelaaja tokan
    private static boolean pelaaja1Voittaa(String ekanSiirto, String tokanSiirto) {
        switch (ekanSiirto) {
            case "k":
                if (tokanSiirto.equals("s")) {
                    return true;
                }
                break;
            case "s":
                if (tokanSiirto.equals("p")) {
                    return true;
                }
                break;
            case "p":
                if (tokanSiirto.equals("k")) {
                    return true;
                }
                break;
            default:
                break;
        }
        return false;
    }

}
