
package day2_ievade;

import java.util.Scanner;


public class Day2_Ievade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// system.in --> no kurienes nolasa, var būt arī mājaslapa
        
        /*System.out.print("Ievadi skaitli:");
        
        int skaitlis = scanner.nextInt();
        System.out.println("Skaitlis ir - " + skaitlis);
        
        System.out.print("Ievadi vārdu: ");
        String vards = scanner.next();
        
        System.out.print("Ievadi uzvārdu: ");
        String uzvards = scanner.next();
        
        System.out.println("Tevi sauc:\n" + vards + " " + uzvards);
        
        System.out.print("Ievadi grādus: ");
        double gradi = scanner.nextDouble();
        
        System.out.print("Ievadi mērvienību (C/F): ");
        String merv = scanner.next().toUpperCase();
        
        if(merv.equals("C")){
            System.out.println(gradi + merv + " izteikti Farenheitā = " + gradi*1.8+32);
            
        }
        else if(merv.equals("F")){
            System.out.println(gradi + merv + " izteikti Celsijā = " + (gradi - 32)*(5/9));
        }
        
        else{
            System.out.println("nepareiza mērvienība!");
        }*/
        
        Uzdevums3 uzd = new Uzdevums3(4120, 10, 8);
        
        System.out.println("Laiks stundās ir " + uzd.laiksH() + "h");
        System.out.println("Laiks sekundēs ir " + uzd.laiksS() + "s");
        System.out.println("Ātrums ir " + uzd.atrums() + "km/min");
        System.out.println("Ātrums km/h ir " + uzd.atrumsKmH() + "km/h");
        System.out.println("Kilometri uz vienu litru ir " + uzd.videjaisPaterinsKmL() + "km");
        System.out.println("patēriņš uz 100km ir " + uzd.videjaisPaterinsL100Km() + "l");
        
        
    }
    
}
