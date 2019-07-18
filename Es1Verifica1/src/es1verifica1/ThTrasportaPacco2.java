/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1verifica1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class ThTrasportaPacco2 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThTrasportaPacco2(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        Random rand = new Random();
        datiC.chiediPermesso2();
        System.out.println("INIZIO TRASPORTO pacco 2");
        try {
            Thread.sleep(rand.nextInt(1000) + 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThConfezionaPacco1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("FINE TRASPORTO pacco 2");

    }
}
