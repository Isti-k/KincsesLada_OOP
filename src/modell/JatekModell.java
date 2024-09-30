/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.Scanner;


public class JatekModell {
    
    
    private Lada[] ladak;
    private int valasztas;
    
    public JatekModell(){
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Én rejtem a kincset!");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset!");
        ladak[2] = new Lada("bronz", "Az arany hazudik!");
        
        //ez is lehetne
        ladak[1].kincsetElhelyez();
        
        
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik felirat a igaz!";
        int i = 1;
        for (Lada lada : ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            a += i + ". " + a + "láda: " + f + "\n";
        }
        return s;
    }

    public int getVasztas(){
        return valasztas;
    }
    
    public String ellenorzes(){
        String s = "Gratulálok eltaláltad!";
        s = ladak[valasztas].isKincs() ? s : "Sajnos nam talált!";
        
        //sc.close();
        return s;
    }

    public int setValasztas(int bekeres) {
        return valasztas;
    }
    
    
    
    
}
