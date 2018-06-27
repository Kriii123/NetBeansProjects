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
public class Square implements Shape {
    
    double mala;

    public Square(double mala) {
        this.mala = mala;
    }
    
    

    @Override
    public double laukums() {
        
        return mala*mala;

    }

    @Override
    public double perimetrs() {
       return mala*4;
    }
    
}
