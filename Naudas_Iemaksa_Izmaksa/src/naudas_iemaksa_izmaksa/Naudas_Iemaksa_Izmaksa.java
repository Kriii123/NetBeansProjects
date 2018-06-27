/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naudas_iemaksa_izmaksa;

import java.util.Scanner;

/**
 *
 * @author Krish
 */
public class Naudas_Iemaksa_Izmaksa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ievadi vārdu:");
        String vards = scanner.next();
        
        System.out.print("Ievadi uzvārdu:");
        String uzvards = scanner.next();
        
        String dzimums = "";
        
        while(true){
        System.out.print("Ievadi dzimumu (V/S):");
        dzimums = scanner.next().toUpperCase();
        if(!dzimums.equals("S")&& !dzimums.equals("V")){
            System.out.println("Nepareizi ievadīts dzimums!");
        }
        else{
            break;
        }
    }
        
    
        
        
        Client c1 = new Client(vards, uzvards, dzimums);
        
        Account account = new Account(0, "EUR", c1);
        
        System.out.println(account.getClient());
        System.out.println("Konta īpašnieks: " + account.getClientName());
        System.out.println("Konta atlikums" + account.getBalance());
        System.out.println();
        
        while (true){
        
        System.out.print("Papildināt kontu - D vai izņemt naudu - W pārtraukt darbu - F?:");
        String op = scanner.next().toUpperCase();
        
        if(op.equals("D")){
            
            double summa = 0;
            while(true){
            System.out.print("Kādu summu vēlies ielikt kontā? ");
            summa = scanner.nextDouble();
            
            if(summa>10000){
                System.out.println("Maksimālā iemaksas summa ir 10000 EUR!");
            }
            else{
                account.deposit(summa);
                break;
            }
            }
          
            System.out.println("Konta iemaksātā summa: " + summa);
        }
        else if(op.equals("W")){
            System.out.println("Kādu summu vēlies izņemt no konta? ");
            double summa = scanner.nextDouble();
            if(summa>account.balance){
                System.out.println("Kontā nepietiek naudas!");
            }
            else if(summa>500){
                
                System.out.println("Maksimālā izmaksas summa ir 500 EUR!");
                
            }
            else{
                account.withdraw(summa);
                System.out.println("No konta izņemtā summa: " + summa);
                
            }
            
        }
        else if(op.equals("F")){
            break;
        }
        System.out.print("Konta bilance: " + account.getBalance());
            System.out.println("");
        }
        System.out.println("Paldies par sadarbību!");
        
        
    }
    
}
