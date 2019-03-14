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
public class ThVisualizza extends Thread{
    DatiCondivisi ptrDatiC;
    
    public ThVisualizza(DatiCondivisi d){
        this.ptrDatiC = d;
    }
        
    @Override
    public void run(){
        System.out.println("Fine visualizza");
    }
}
