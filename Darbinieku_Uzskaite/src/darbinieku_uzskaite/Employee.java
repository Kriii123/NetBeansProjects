/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darbinieku_uzskaite;

/**
 *
 * @author Krish
 */
public class Employee {
    
    String name;
    String surname;
    String dateOfBirth;

    public Employee(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Vārds: " 
                + name + ", Uzvārds: " 
                + surname + ", Dzimšanas datums: " 
                + dateOfBirth + "\n";
    }
    
    

    
    

    
    
    
    
}
