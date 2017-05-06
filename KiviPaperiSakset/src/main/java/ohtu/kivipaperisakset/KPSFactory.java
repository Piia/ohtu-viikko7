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
public class KPSFactory {
    
    private static final int PARANNETUN_TEKOALYN_MUISTIN_KOKO = 20;
    
    public static KPSTemplate luoPelaajaVsPelaaja(Tuomari tuomari, IO io) {
        return new KPSPelaajaVsPelaaja(tuomari, io);
    }
    
    public static KPSTemplate luoPelaajaVsTekoaly(Tuomari tuomari, IO io) {
        return new KPSPelaajaVsTekoaly(tuomari, io);
    }
    
    public static KPSTemplate luoPelaajaVsParempiTekoaly(Tuomari tuomari, IO io) {
        return new KPSPelaajaVsParempiTekoaly(tuomari, io, PARANNETUN_TEKOALYN_MUISTIN_KOKO);
    }
    
    

}
