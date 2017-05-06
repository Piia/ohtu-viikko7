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
public class KPSPelaajaVsTekoaly extends KPSTemplate {
    
    int siirto;

    public KPSPelaajaVsTekoaly(Tuomari tuomari, IO io) {
        super(tuomari, io);
        siirto = 0;
    }

    @Override
    protected String tokanPelaajanSiirto() {
        siirto++;
        siirto = siirto % 3;
        
        String palautettava;
        
        switch(siirto) {
            case 0: 
                palautettava = "k";
                break;
            case 1:
                palautettava = "p";
                break;
            default:
                palautettava = "s";
                break;
        }
        
        io.tulosta("Tietokone valitsi: " + palautettava);
        return palautettava;
    }

    @Override
    protected void annaEkanSiirtoTokalle(String siirto) {
    }

}
