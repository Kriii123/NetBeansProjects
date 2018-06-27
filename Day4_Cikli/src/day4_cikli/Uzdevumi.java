/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_cikli;



/**
 *
 * @author Krish
 */
public class Uzdevumi {
    
   
    int skaits;

    public Uzdevumi(int skaits) {
        this.skaits = skaits;
    }
    
    public void pirmieNSkaitli(){
        int sum = 0;
        for(int i = 1; i<=skaits; i++){
        System.out.println(i);
        sum += i;
        
        }
        System.out.println("summa = " + sum);
    }
    
    public void NSkaits(){
        
    }
        
        
    
    

    
}
