/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Krish
 */
public class Day6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cik skaitļus ievadīsi? :");
        
        int skaits = scanner.nextInt();
        ArrayList<Integer> lielakaisMazakais= new ArrayList<Integer>();
        
        for(int i = 1; i<=skaits; i++){
            
            System.out.println("Ievadi " + i + ". skaitli:");
            lielakaisMazakais.add(scanner.nextInt());
              
        }
        
        int min = lielakaisMazakais.get(0);
        int max = lielakaisMazakais.get(0);
        
        for(int skaitlis : lielakaisMazakais){
            
            if(skaitlis<min){
                min = skaitlis;
            }
            else if(skaitlis>max){
                max = skaitlis;
            }
        }
        
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        
        
      
        System.out.print("Cik skaitļus ievadīsi pirmajā sarakstā? :");
        
        int skaits1 = scanner.nextInt();
        ArrayList<Integer> list1= new ArrayList<Integer>();
        for(int i = 1; i<=skaits1; i++){
            
            System.out.println("Ievadi " + i + ". skaitli:");
            list1.add(scanner.nextInt());
        }
        
        System.out.print("Cik skaitļus ievadīsi otrajā sarakstā? :");
        
        int skaits2 = scanner.nextInt();
        ArrayList<Integer> list2= new ArrayList<Integer>();
        for(int i = 1; i<=skaits2; i++){
            
            System.out.println("Ievadi " + i + ". skaitli:");
            list2.add(scanner.nextInt());
        }
        ArrayList<Integer> list3= new ArrayList<Integer>();
        
        for(int skaitlis1 : list1){
            for(int skaitlis2 : list2){
                
                if (skaitlis1 == skaitlis2){
                    
                    list3.add(skaitlis1);  
                      
                        
                    }
                        
                        
                 
                    
                }
            }
        
       
        
        System.out.println("vienādās vērtības" + list3);
            
        
        
        
    }  
    
}
