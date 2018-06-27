/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Krish
 */
public class Uzdevumi {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void Piemeri(){
        
        System.out.println("Ievadi valsti: ");
        String valsts = scanner.next().toLowerCase();
        
        switch(valsts){
            case "latvija":
                System.out.println("Rīga");
                break;
            case "lietuva":
                System.out.println("Viļņa");
                break;
            case "igaunija":
                System.out.println("Tallina");
                break;
            default:
                System.out.println("Nezināma valsts.");
                break;
                
        }
        
    }
    
    public static void MasiviSaraksti(){
        int[] skaitluMasivs = new int[3];
        skaitluMasivs[0] = 5;
        skaitluMasivs[1] = 3;
        skaitluMasivs[2] = 2;
        
        int[] skaitluMasivs2 = {5,3,2};
        int masivaIeraksti = skaitluMasivs2.length;
        int tresaisSkaitlis = skaitluMasivs2[2];
        
        boolean irCetri = false;
        for(int skaitlis : skaitluMasivs2){
            System.out.println(skaitlis);
            if(skaitlis == 4){
                System.out.println("Skaitlis 4 ir masīvā.");
                irCetri = true;
            }
            
        }
        if(!irCetri){
            System.out.println("Skaitlis 4 nav masīvā.");
        }
        
        
        ArrayList<String> tekstaSaraksts = new ArrayList<String>();
        
        tekstaSaraksts.add("teksts");
        tekstaSaraksts.add("teksts2");
        tekstaSaraksts.add("teksts3");
        
        int sarakstaIeraksti = tekstaSaraksts.size();
        String pirmaisVards = tekstaSaraksts.get(0);
        
        for(String vards : tekstaSaraksts){
            System.out.println(vards);
        }
        
        
        
        
        
        
    }
    
   
    public static void kalkulators(){
        System.out.println("Ievadi 1. skaitli: ");
        double skaitlis1 = scanner.nextDouble();
        System.out.println("Ievadi matemātisko operāciju: ");
        String operacija1 = scanner.next();
        System.out.println("Ievadi 2. skaitli: ");
        double skaitlis2 = scanner.nextDouble();
        System.out.println("Ievadi matemātisko operāciju: ");
        String operacija2 = scanner.next();
        System.out.println("Ievadi 3. skaitli: ");
        double skaitlis3 = scanner.nextDouble();
        
         double iznakums;
        
        if(operacija1.equals("*") || operacija1.equals("/")){
            
            iznakums = aprekins(skaitlis1, skaitlis2, operacija1);
            iznakums = aprekins(iznakums, skaitlis3, operacija2);
            
        }
        else {
            iznakums = aprekins(skaitlis2, skaitlis3, operacija2);
            iznakums = aprekins(skaitlis1, iznakums, operacija1);
            
            
        }
        
        System.out.println("Rezultāts = " + iznakums);
        
        
    }
    private static double aprekins(double skaitlis1, double skaitlis2, String operacija1){
            
             switch(operacija1){
                 case "*":
                     return skaitlis1*skaitlis2;
                 case "/":
                     return skaitlis1/skaitlis2;
                 case "+":
                     return skaitlis1+skaitlis2;
                 case "-":
                     return skaitlis1-skaitlis2;
                 default:
                     return 0;
                     
             }
               
        }
    
    
            
               
               
       
                
}
