/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Krish
 */
public class Kravas extends Transportlidzeklis{
    
    double ietilpiba;

    public Kravas(String razotajs, String marka, int gads, double ietilpiba) {
        super(razotajs, marka, gads); //paņem augstāk esošu konstruktoru
        
        this.ietilpiba = ietilpiba;
    }
    
    @Override
    public String toString(){
        String teksts = super.toString();// ar super izsaucam no klases, no kuras mantojām
        teksts += ", ietilpība = " + this.ietilpiba;
        return teksts;
        
    }
   
    
    
    
    
}
