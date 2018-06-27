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
public class Rectange implements Shape{
    
    double mala1;
    double mala2;

    public Rectange(double mala1, double mala2) {
        this.mala1 = mala1;
        this.mala2 = mala2;
    }
    
    
    

    @Override
    public double laukums() {
        return mala1*mala2;
    }

    @Override
    public double perimetrs() {
        return (mala1+mala2)*2;
    }
    
    
}
