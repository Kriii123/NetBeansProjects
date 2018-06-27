/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzdevums_6;

import java.util.Scanner;

/**
 *
 * @author Krish
 */
public class Cube {
    
    Scanner scanner = new Scanner(System.in);
    
    
    
    public void cubes(){
        
        System.out.print("Ievadi skaitu: ");
        int skaits = scanner.nextInt();
        
        for(int i = 1; i<=skaits; i++){
            System.out.println(i + " = " + (i*i*i));
        }
    }
    
    public void nTrijsturis(){
        
        System.out.println("Ievadi rindu skaitu: ");
        int skaits = scanner.nextInt();
        
        char zv = '*';
        
        for(int i = 1; i<=skaits; i++){
            
            for(int j = 0; j<i; j++){
              System.out.print(zv); 
              
            }
            System.out.println("");
            
        }
       
    }
    public void rezgis(){
        System.out.println("Ievadi rindu skaitu: ");
        int skaits = scanner.nextInt();
      for(int k=1; k<=skaits; k++){
         
        if(k%2!=0){  
          for(int i = 1; i<=skaits; i++){
           
            System.out.print(i);
        }
        }
        else{
        for(int i = skaits; i>=1; i--){
           
            System.out.print(i);
        } 
        
        }
          System.out.println("");
      } 
        
        
    }
    public void reverseNumber(){
        System.out.println("Ievadi vismaz divciparu skaitli: ");
        int skaitlis = scanner.nextInt();
        
        int apgrieztsSkaitlis = 0;
        while(skaitlis != 0){
            apgrieztsSkaitlis = apgrieztsSkaitlis*10 + skaitlis%10;
            skaitlis = skaitlis/10;
            
        }
        
        System.out.println("Apgriezts skaitlis = " + apgrieztsSkaitlis);
          
    }
    
    public void skaitluPiramida(){
        System.out.print("Ievadi skaitli: ");
        int skaitlis = scanner.nextInt();
        
        int value = 1;
        
        for(int i=0; i<=skaitlis; i++){
            
            for(int j=0; j<skaitlis-i; j++){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++) {
                
                if(value<10){
                    System.out.print(0);
                }
            System.out.print(value + "  ");
            value++;
            }
            System.out.println();
        }
        
        
    }
    
            
            
   
    
}
