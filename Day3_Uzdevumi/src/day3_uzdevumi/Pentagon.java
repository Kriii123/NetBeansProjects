/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_uzdevumi;

/**
 *
 * @author Krish
 */
public class Pentagon implements Shape{
    
    double mala;

    public Pentagon(double mala) {
        this.mala = mala;
    }
    
    

    @Override
    public double laukums() {
        return 0.25*Math.sqrt(5*(5 + (2*Math.sqrt(5)))*(mala*mala));
    }

    @Override
    public double perimetrs() {
        return mala*5;
    }
    
}
