/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_ievade;

/**
 *
 * @author Krish
 */
public class Uzdevums3 {
    
    double attalums;
    double laiks;
    double degviela;

    public Uzdevums3(double attalums, double laiks, double degviela) {
        this.attalums = attalums;
        this.laiks = laiks;
        this.degviela = degviela;
    }
    
    public double laiksH(){
        return laiks/60;
    }
    
    public double laiksS(){
        return laiks*60;
    }
    
    public double atrums(){
        return attalums/laiks;
    }
    public double atrumsKmH(){
        return attalums/laiksH();
    }
    public double videjaisPaterinsKmL(){
        return attalums/degviela;
        
    }
    public double videjaisPaterinsL100Km(){
        return degviela/(attalums/100);
    }
}
