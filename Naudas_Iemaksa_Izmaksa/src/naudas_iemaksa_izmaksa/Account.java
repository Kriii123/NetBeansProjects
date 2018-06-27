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
public class Account {
    
    double balance;
    String currency;
    Client client;

    public Account(double balance, String currency, Client client) {
        this.balance = balance;
        this.currency = currency;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
    
    public String getClientName(){
        return getClient().name;
    }
    
    public String getBalance(){
        return balance + currency;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
    
    public void withdraw(double amount){
        balance = balance - amount;
    }
    
}
