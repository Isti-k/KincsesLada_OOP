/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.Scanner;


public class Jatek {
    private static final Scanner sc = new Scanner(System.in);
    
    private Lada[] ladak;
    
    public Jatek(){
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Én rejtem a kincset!");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset!");
        ladak[2] = new Lada("bronz", "Az arany hazudik!");
        
        //ez is lehetne
        ladak[1].kincsetElhelyez();
        
        kezdes();
        bekeres();
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

    public void bekeres() {
        System.out.println("Melyikben van a kincs? (1 ,2, 3): ");
        int v = sc.nextInt();
    }
    
    public void megjelenit(String uzenet){
        System.out.println(uzenet);
    }
}
