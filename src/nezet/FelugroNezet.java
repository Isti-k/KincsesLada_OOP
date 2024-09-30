/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class FelugroNezet {
  
    public int bekeres() {
        String v = JOptionPane.showInputDialog("Melyikben van a kincs? (1 ,2, 3): ");
        return Integer.parseInt(v) -1;
        
    }
    
    public void megjelenit(String uzenet){
        JOptionPane.showMessageDialog(null, uzenet);
    }
    
    
}
