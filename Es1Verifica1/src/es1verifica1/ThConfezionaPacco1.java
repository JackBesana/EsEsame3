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
public class ThConfezionaPacco1 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThConfezionaPacco1(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
  
           Random rand = new Random();
            System.out.println("INIZIO CONFEZIONE pacco 1");
        try {
            Thread.sleep(rand.nextInt(1000) + 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThConfezionaPacco1.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("FINE CONFEZIONE pacco 1");
            datiC.daiPermesso1();
        
    }
}
