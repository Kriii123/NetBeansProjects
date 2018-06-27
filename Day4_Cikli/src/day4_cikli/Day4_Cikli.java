/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_cikli;

import java.util.Scanner;

/**
 *
 * @author Krish
 */
public class Day4_Cikli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ne statiska metode
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ievadi skaitli: ");
        int skaitlis = scanner.nextInt();
       
        Uzdevumi uzd = new Uzdevumi(skaitlis);
        uzd.pirmieNSkaitli();
        
        
        System.out.print("Ievadi skaitu: ");
        int sk = scanner.nextInt();
        
        int sum = 0;
        for(int i = 1; i<=sk; i++){
            
            System.out.print("Ievadi " + i + ". skaitli: ");
            int sk1 = scanner.nextInt();
            sum = sum+sk1;
            
        }
        int vid = sum/sk;
        
        System.out.println("summa = " + sum);
        System.out.println("Vidējā vērtība = " + vid);
        
    }
    
}
