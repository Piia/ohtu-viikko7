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
public class Pisteenlasku {

    private int pelaaja1;
    private int pelaaja2;
    private int tasapelit;

    public Pisteenlasku() {
        this.pelaaja1 = 0;
        this.pelaaja2 = 0;
        this.tasapelit = 0;
    }
    
    public void pistePelaajalle1() {
        pelaaja1++;
    }
    
    public void pistePelaajalle2() {
        pelaaja2++;
    }
    
    public void tasapeli() {
        tasapelit++;
    }

    public String raportti() {
        String s = "Pelitilanne: " + pelaaja1 + " - " + pelaaja2 + "\n"
                + "Tasapelit: " + tasapelit;
        return s;
    }

//    public void paivitaTilanne() {
//        String paivitys = "Pelitilanne: " + pelaaja1 + " - " + pelaaja2 + "\n"
//                + "Tasapelit: " + tasapelit;
//        io.tulosta(paivitys);
//    }
}
