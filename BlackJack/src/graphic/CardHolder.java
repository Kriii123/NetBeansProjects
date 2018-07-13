/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import javax.swing.JPanel;

/**
 *
 * @author Krish
 */
public class CardHolder extends JPanel {
    
    public void addCard(CardImage card){
        
        this.add(card);
    
}
    public void clear(){
        
        this.removeAll();
    
}
    
    
    
}
