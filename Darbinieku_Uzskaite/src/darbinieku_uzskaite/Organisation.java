/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darbinieku_uzskaite;

import java.util.ArrayList;

import javax.naming.directory.SearchResult;

/**
 *
 * @author Krish
 */
public class Organisation {
    
    String organisationName;
    
    public Organisation(String organisationName) {
        this.organisationName = organisationName;
        System.out.println("Izveidots jauns SIA - " + organisationName);
        
    }
    
    ArrayList<Employee> darbinieki = new ArrayList<Employee>();
    
    
    
    public void addEmployee(String name, String surname, String dateOfBirth){
       
        Employee employee1 = new Employee(name, surname, dateOfBirth);
        
        darbinieki.add(employee1);
        
        System.out.println("Pievienots jauns darbinieks - " + name.substring(0,1) + ". " + surname + " " + dateOfBirth);
        
    }
    
    public void fire(String name, String surname){
    
       for(Employee darbinieks : darbinieki){
           
           if(name.equals(darbinieks.name) && surname.equals(darbinieks.surname)){
            
               System.out.println("Atlaists darbinieks - " 
                       + darbinieks.name.substring(0,1) + ". " + darbinieks.surname);
               darbinieki.remove(darbinieks);
               break;  
           } 
       }  
    }  
    public void changeData(String name, String surname, String dateOfBirth){
         for(Employee darbinieks : darbinieki){
             if(name.equals(darbinieks.name) && surname.equals(darbinieks.surname)){
                darbinieks.dateOfBirth=dateOfBirth;
                 System.out.println("Mainīti darbinieka " 
                         + darbinieks.name.substring(0,1) 
                         + ". " + darbinieks.surname + " dati.");
             }
         }
    }
    
    public void printAll(){
        System.out.println("Uzņēmumā " + organisationName + " strādā: \n" + darbinieki);
    }
   
}
