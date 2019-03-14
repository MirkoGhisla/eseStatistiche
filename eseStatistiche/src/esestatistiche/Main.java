/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

import java.util.Scanner;

/**
 *
 * @author ghislanzoni_mirko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quanti caratteri devo generare?");
        int numero=scan.nextInt();
        
        DatiCondivisi d  = new DatiCondivisi(3);
        
        ThGenera thGenera = new  ThGenera(d);
        ThSpazi thSpazi = new ThSpazi(d);
        ThPunti thPunti = new ThPunti(d);
        ThVisualizza thVisualizza = new ThVisualizza(d);
        
        thGenera.start();
        thSpazi.start();
        thPunti.start();
        thVisualizza.start();
        
        System.out.println("Fine");
    }
    
}
