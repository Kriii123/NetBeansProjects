/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

import java.sql.*;
import java.util.Scanner;



/**
 *
 * @author Krish
 */
public class Day10 {
    
    private static Connection connection;
    private static Scanner scanner = new Scanner(System.in);
    private static void connectToAndQueryDatabase(String username, String password) {
        try{

    connection = DriverManager.getConnection(
                         "jdbc:mysql://localhost:3306/myDb?zeroDateTimeBehavior=convertToNull",
                         username,
                         password);

    
    }catch(Exception ex){
            
            System.out.println(ex.toString());
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connectToAndQueryDatabase("root", "esuntuir432");
        
        
        System.out.println("Pieejamās darbības: ");
        System.out.println("0 - pārtraukt darbu");
        System.out.println("1 - apskatīt darbiniekus");
        System.out.println("2 - pievienot darbiniekus");
        
        while(true){
            
            System.out.print("Ievadi darbību: ");
            
            String darbiba = scanner.next();
            switch(darbiba){
                case"0":
                    return;
                case"1":
                    printEmployees();
                    break;
                case"2":
                    insertEmployee();
                    break;
            }
        }
    } 
    
    
    
    private static void insertEmployee(){
        try{
        Statement stmt = connection.createStatement();
            System.out.print("Ievadiet darbinieka ID: ");
            int darbieniekaID = scanner.nextInt();
            System.out.print("Ievadiet darbinieka vārdu: ");
            String darbieniekaVards = scanner.next();
            System.out.print("Ievadiet darbinieka pieņemšanas datumu: ");
            String datums = scanner.next();
            System.out.print("Ievadiet darbinieka algu: ");
            int darbieniekaAlga = scanner.nextInt();
        stmt.executeUpdate(String.format("INSERT INTO employees(id,employee_name,hire_date,salary)VALUES(%s,'%s', '%s', %s)", darbieniekaID,darbieniekaVards,datums,darbieniekaAlga));
            System.out.println("Darbinieks pievienots!");
        }catch(Exception ex){
            
            System.out.println(ex.toString());
            
        }
}
   private static void printOrganisations(){
       try{
        Statement stmt = connection.createStatement();
    
    
    ResultSet idDepartment = stmt.executeQuery("SELECT ID, name, location FROM Department");
    
   

    
    while (idDepartment.next()) {
        
        
        int id = idDepartment.getInt("id");
        String name = idDepartment.getString("name");
        String location = idDepartment.getString("location");
       
        System.out.println(id + " " + name + " " + location);
    }
        }catch(Exception ex){
            
            System.out.println(ex.toString());
            
        }
       
       
   }
    private static void printEmployees(){    
        try{
        Statement stmt = connection.createStatement();
    
    
    //ResultSet idDepartment = stmt.executeQuery("SELECT ID, name, location FROM Department");
    ResultSet idEmployee = stmt.executeQuery("SELECT e.id, e.employee_name, d.id,d.name\n" +
"FROM employees e, department d\n" +
"WHERE e.dep_id = d.id");
   

    while (idEmployee.next()) {
        
        
        int id = idEmployee.getInt("id");
        String name = idEmployee.getString("employee_name");
        
        String department = idEmployee.getString("d.name");
        
       
        System.out.println(id + " " + name  + " " + department);
    }
    /*while (idDepartment.next()) {
        
        
        int id = idDepartment.getInt("id");
        String name = idDepartment.getString("name");
        String location = idDepartment.getString("location");
       
        System.out.println(id + " " + name + " " + location);
    }*/
        }catch(Exception ex){
            
            System.out.println(ex.toString());
            
        }
        
    }
    
    }


    
    

