/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1verifica1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class Es1Verifica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

            DatiCondivisi datiC = new DatiCondivisi();

            ThConfezionaPacco1 th1 = new ThConfezionaPacco1(datiC);
            ThConfezionaPacco2 th2 = new ThConfezionaPacco2(datiC);
            ThTrasportaPacco1 th3 = new ThTrasportaPacco1(datiC);
            ThTrasportaPacco2 th4 = new ThTrasportaPacco2(datiC);

            System.out.println("Premere s per iniziare");
            String s = console.readLine();

            th1.start();
            th2.start();
            th3.start();
            th4.start();

            th1.join();
            th2.join();
            th3.join();
            th4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Es1Verifica1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
