/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

/**
 *
 * @author ghislanzoni_mirko
 */
public class ThPunti extends Thread {

    DatiCondivisi ptrDatiC;
    boolean fine;

    public ThPunti(DatiCondivisi d) {
        this.ptrDatiC = d;
        fine = false;
    }

    @Override
    public void run() {
        while (!fine) {
            char car = ptrDatiC.getBuffer();
            if (car == '.') {
                ptrDatiC.incrementaPuntiLetti();
            }
        }
        System.out.println("Fine conta punti");
    }
}
