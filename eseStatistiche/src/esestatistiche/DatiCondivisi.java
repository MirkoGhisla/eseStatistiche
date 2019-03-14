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
    //private Vector<Character> buffer;
    private char buffer;
    private int numSpaziInseriti, numPuntiInseriti;
    private int numSpaziLetti, numPuntiLetti;
    private int numChar;
    
    public DatiCondivisi(int num){
        //this.buffer=new Vector<Character>();
        this.buffer=' ';
        this.numSpaziInseriti=0;
        this.numPuntiInseriti=0;
        this.numSpaziLetti=0;
        this.numPuntiLetti=0;
        this.numChar=num;
    } 
    
    public char getBuffer(){
        return buffer;
    }
    
    public void incrementaPuntiLetti(){
        numPuntiLetti++;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setBuffer(char buffer) {
        this.buffer = buffer;
    }

    public int getNumSpaziInseriti() {
        return numSpaziInseriti;
    }

    public void setNumSpaziInseriti(int numSpaziInseriti) {
        this.numSpaziInseriti = numSpaziInseriti;
    }

    public int getNumPuntiInseriti() {
        return numPuntiInseriti;
    }

    public void setNumPuntiInseriti(int numPuntiInseriti) {
        this.numPuntiInseriti = numPuntiInseriti;
    }

    public int getNumSpaziLetti() {
        return numSpaziLetti;
    }

    public void setNumSpaziLetti(int numSpaziLetti) {
        this.numSpaziLetti = numSpaziLetti;
    }

    public int getNumPuntiLetti() {
        return numPuntiLetti;
    }

    public void setNumPuntiLetti(int numPuntiLetti) {
        this.numPuntiLetti = numPuntiLetti;
    }
    
    

}
