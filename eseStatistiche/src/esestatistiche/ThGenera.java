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
public class ThGenera extends Thread {
    DatiCondivisi ptrDatiC;
    
    public ThGenera(DatiCondivisi d){
        this.ptrDatiC = d;
    }
    
    @Override
    public void run(){
        int num = ptrDatiC.getNumChar();
        for (int i=0; i<num; i++);{
        char car='a';
        ptrDatiC.setBuffer(car);
    }
        System.out.println("Fine genera");
    }
}
