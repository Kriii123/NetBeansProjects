/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darbinieku_uzskaite;

import java.util.ArrayList;

/**
 *
 * @author Krish
 */
public class Darbinieku_Uzskaite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Organisation org = new Organisation("SIA Bērziņš");
        
        org.addEmployee("Krišs", "Ravs", "23/02/1999");
        org.addEmployee("Jānis", "Tasmans", "12/03/1994");
        org.addEmployee("Juris", "Vieds", "13/04/1995");
        
        org.fire("Jānis", "Tasmans");
        org.changeData("Juris", "Vieds", "13/04/1994");
        
        org.printAll();
        
        
        
        
    }
    
}
