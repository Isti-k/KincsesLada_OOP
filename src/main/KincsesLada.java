/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import modell.JatekModell;
import nezet.FelugroNezet;
import vezerlo.FekugroVezerlo;


public class KincsesLada {

    
    public static void main(String[] args) {
        //new JatekModell();
        
        JatekModell modell = new JatekModell();
        FelugroNezet nezet = new FelugroNezet();
        new FekugroVezerlo(modell, nezet);
    }
    
}
