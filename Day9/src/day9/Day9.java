/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.sql.*;


/**
 *
 * @author Krish
 */
public class Day9 {
    
    
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        connectToAndQueryDatabase("root", "esuntuir432");
        
    }
    
    public static void connectToAndQueryDatabase(String username, String password) {
        try{

    Connection con = DriverManager.getConnection(
                         "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull",
                         username,
                         password);

    Statement stmt = con.createStatement();
    
    stmt.executeUpdate("INSERT INTO students(ID,name) VALUES(6450,'Juris')");
    ResultSet rs = stmt.executeQuery("SELECT ID, name FROM students");
    
   

    while (rs.next()) {
        
        
        int s = rs.getInt("ID");
        String f = rs.getString("name");
       
        System.out.println(s + " " + f);
    }
    
    } catch(Exception ex){
            
            System.out.println(ex.toString());
            
        }
        
        

    
}
    
    
}
