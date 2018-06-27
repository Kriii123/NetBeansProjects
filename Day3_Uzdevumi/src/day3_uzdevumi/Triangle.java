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
public class Triangle implements Shape{
    
    double mala1;
    double mala2;
    double mala3;

    public Triangle(double mala1, double mala2, double mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;
    }
    
    
    
    
    public double Pusperimetrs(){
        return (mala1+mala2+mala3)/2;
    }

    @Override
    public double laukums() {
        return Math.sqrt(Pusperimetrs()
                *(Pusperimetrs()-mala1)
                *(Pusperimetrs()-mala2)
                *(Pusperimetrs()-mala3));
    }

    @Override
    public double perimetrs() {
       return mala1+mala2+mala3;
       
    }
    
}
