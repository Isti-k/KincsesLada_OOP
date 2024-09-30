/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.JatekModell;
import nezet.FelugroNezet;


public class FekugroVezerlo {
    private JatekModell modell;
    private FelugroNezet nezet;
    
    public FekugroVezerlo(JatekModell modell, FelugroNezet nezet){
        this.modell = modell;
        this.nezet = nezet;
        start();
    }

    private void start() {
        nezet.megjelenit(modell.ellenorzes());
        modell.setValasztas(nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());
    }
}
