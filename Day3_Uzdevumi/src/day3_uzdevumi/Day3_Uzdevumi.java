/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_uzdevumi;

import java.util.Scanner;

/**
 *
 * @author Krish
 */
public class Day3_Uzdevumi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Square s1 = new Square(5);
        s1.perimetrs();
        s1.laukums();
        
        Rectange r1 = new Rectange(5, 2);
        r1.perimetrs();
        r1.laukums();
        
        Triangle t1 = new Triangle(5, 3, 4);
        t1.perimetrs();
        t1.laukums();
        
        Pentagon p1 = new Pentagon(5);
        p1.perimetrs();
        p1.laukums();
        
        //System.out.println("Ievadi figūru: \nS = Square\nR = Rectangle\nT = Tringle\nP = Pentagon");
        //String figura = scanner.next().toUpperCase();
        calculateAreaAndPerimeter(s1);
         calculateAreaAndPerimeter(r1);
          calculateAreaAndPerimeter(t1);
           calculateAreaAndPerimeter(p1);
        
    }
    
    static void calculateAreaAndPerimeter(Shape forma){
        forma.laukums();
        forma.perimetrs();
        System.out.println("Laukums = " + forma.laukums()+"\nPerimetrs = " + forma.perimetrs()); 
       
        
        
    }
    
}
