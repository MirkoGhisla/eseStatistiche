/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

import java.util.Vector;

/**
 *
 * @author ghislanzoni_mirko
 */
public class DatiCondivisi {
    private Vector<Character> buffer;
    private int numSpaziInseriti, numPuntiInseriti;
    private int numSpaziLetti, numPuntiLetti;
    
    public DatiCondivisi(){
        this.buffer=new Vector<Character>();
        this.numSpaziInseriti=0;
        this.numPuntiInseriti=0;
        this.numSpaziLetti=0;
        this.numPuntiLetti=0;
    }
}
