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
public class ThSpazi extends Thread{
        DatiCondivisi ptrDatiC;
    
    public ThSpazi(DatiCondivisi d){
        this.ptrDatiC = d;
    }
    
    @Override
    public void run(){
        System.out.println("Fine conta spazi");
    }
}
