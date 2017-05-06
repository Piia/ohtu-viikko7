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
public abstract class KPSTemplate implements Peli {

    protected IO io;
    protected Tuomari tuomari;
    
    public KPSTemplate(Tuomari tuomari, IO io) {
        this.tuomari = tuomari;
        this.io = io;
    }

    @Override
    public void pelaa() {
        while (true) {
            io.tulosta("Ensimmäisen pelaajan siirto: ");
            String siirto1 = io.lue();
            String siirto2 = tokanPelaajanSiirto();
            annaEkanSiirtoTokalle(siirto1);
            
            if (siirtoOnLaillinen(siirto1) && siirtoOnLaillinen(siirto2)) {
            } else {
                break;
            }

            tuomari.kirjaaSiirto(siirto1, siirto2);
            io.tulosta(tuomari.raportoi());
            io.tulosta("");

        }
        io.tulosta("");
        io.tulosta("Kiitos!");
        io.tulosta(tuomari.raportoi());
    }
    
    protected abstract String tokanPelaajanSiirto();
    protected abstract void annaEkanSiirtoTokalle(String siirto);

    protected boolean siirtoOnLaillinen(String siirto) {
        switch (siirto) {
            case "k":
                return true;
            case "p":
                return true;
            case "s":
                return true;
            default:
                return false;
        }
    }

}
