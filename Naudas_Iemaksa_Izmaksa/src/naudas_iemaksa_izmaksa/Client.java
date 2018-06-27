/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naudas_iemaksa_izmaksa;

/**
 *
 * @author Krish
 */
public class Client {
    
    String name;
    String surname;
    String sex;

    public Client(String name, String surname, String sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Client{" + "Vārds = " + name + ", Uzvārds = " + surname + ", dzimums = " + sex + '}';
    }
    
    
    
}
