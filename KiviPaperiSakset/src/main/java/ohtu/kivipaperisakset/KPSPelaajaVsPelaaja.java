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
public class KPSPelaajaVsPelaaja extends KPSTemplate {

    public KPSPelaajaVsPelaaja(Tuomari tuomari, IO io) {
        super(tuomari, io);
    }

    @Override
    protected String tokanPelaajanSiirto() {
        io.tulosta("Toisen pelaajan siirto: ");
        return io.lue();
    }

    @Override
    protected void annaEkanSiirtoTokalle(String siirto) {
    }



}
