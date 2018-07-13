/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Krish
 */
public class Table {
    
    private Dealer dealer;
    private Player player;
    private Deck deck;
    
    public Table(){
        
    }
    
    public void startNewGame(){
        
        player = new Player();
        dealer = new Dealer();
        deck = new Deck();
        deck.shuffle();
        player.giveCard(deck.takeCard());
        player.giveCard(deck.takeCard());
        dealer.giveCard(deck.takeCard());
        dealer.giveCard(deck.takeCard());
        
        
    }
    public void dealerTurn(){
        
        while (dealer.needOtherCard()){
            
           dealer.giveCard(deck.takeCard()); 
        }  
    }
    public void givePlayerCard(){
        
        player.giveCard(deck.takeCard());
    }
    
    public int getPlayerPoints(){
        
        return player.countPoints();
    }
    
    public int getDealerPoints(){
        
        return dealer.countPoints();
    }
    
    public String getResult(){
        
        String uzvara = "";
        
        if(player.countPoints()> dealer.countPoints() && player.countPoints()<=21){
            uzvara = "Tu uzvarēji";  
        }
        else if(dealer.countPoints()>21){
            uzvara = "Tu uzvarēji";
        }
        
        else if(player.countPoints()== dealer.countPoints()){
            uzvara = "Nav uzvarētāja";
        }
        else{
            uzvara = "Dīleris uzvarēja";
        }
        return uzvara;
      
    }
    
    public ArrayList<Card> getPlayerCards(){
        
        return player.getCards();
        
    }
    
    public ArrayList<Card> getDealerCards(){
        
        return dealer.getCards();
        
    }
    
}

