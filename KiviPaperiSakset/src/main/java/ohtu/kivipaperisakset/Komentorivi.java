/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author Piia Hartikka
 */
public class Komentorivi implements IO {
    
    private Scanner lukija;
    
    public Komentorivi(Scanner lukija) {
        this.lukija = lukija;
    }

    @Override
    public String lue() {
        return lukija.nextLine();
    }

    @Override
    public void tulosta(String teksti) {
        System.out.println(teksti);
    }

}
