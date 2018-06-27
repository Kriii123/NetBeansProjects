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
public class Aplis implements Figuras{

    public double radiuss;
    public String krasa;
    
    
    @Override
    public double laukums() {
        return Math.PI*this.radiuss*this.radiuss;
    }

    @Override
    public String krasa() {
        return krasa;
    }

    @Override
    public double perimetrs() {
        return 2*Math.PI*this.radiuss;
    }
    
}
