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
public class Pasazieru extends Transportlidzeklis {
    
    public int maxPasazieri;

    public Pasazieru(String razotajs, String marka, int gads, int maxPasazieri) {
        super(razotajs, marka, gads);
        
        this.maxPasazieri = maxPasazieri;
    }

    @Override
    public String toString(){
        String teksts = super.toString();// ar super izsaucam no klases, no kuras mantojām
        teksts += ", maksimālais pasažieru skaits = " + this.maxPasazieri;
        return teksts;
    }
    
    
    
    
}
