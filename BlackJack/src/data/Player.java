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
public class Player {
    
    private ArrayList<Card> cards;
    
    public Player(){
        this.cards = new ArrayList();
    }
    
    public void giveCard(Card card){
        
        cards.add(card);
        
    }
    public boolean needOtherCard(){
        return countPoints() < 21;
        
    }
    public int countPoints(){
        int totalPoints = 0;
        int aceCount = 0;
        for(Card card : cards){
            
            int value = card.GetValue();
            totalPoints += value;
            if(value == 11){
                aceCount++;
            }
        }
        while(totalPoints>21 && aceCount>0){
            
            totalPoints -= 10;
            aceCount--;
  
           
        }
        return totalPoints;
        
    }
    public ArrayList<Card> getCards(){
        return this.cards;
    }
    
    
}
