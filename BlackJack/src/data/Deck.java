/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Krish
 */
public class Deck {
    
    private ArrayList<Card> cards;
    
    private String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A",};
    private char[] suits = {'H','S', 'C','D'};

    public Deck() {
        this.cards = new ArrayList();
        
        for(char suit : suits){
            for(String value : values){
                this.cards.add(new Card(suit, value));
            }
        }
       
    }
    
    public void shuffle(){
        Collections.shuffle(this.cards);
    }
    public Card takeCard(){
        
        Card lastCard = cards.get(cards.size() - 1);
        
        cards.remove(lastCard);
        
        return lastCard;
        
    }
    
    
    
    
}
