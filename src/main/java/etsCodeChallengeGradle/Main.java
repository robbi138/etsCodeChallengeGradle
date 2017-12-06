/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsCodeChallengeGradle;

/**
 *
 * @author Shadver
 */
public class Main {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            creates two decks, prints one out to make sure all cards have been
            created and can be dealt. Shuffles the second one and then prints
            it out to make sure the shuffle sufficiently randomizes the card
            order
        */
        deck d = new deck();
        deck d2 = new deck();
        int count = 0;
        System.out.println("Deck 1:");
        for(int i = 0; i<53; i++){
            card c = d.dealOneCard();
            if(c != null){
                String s = c.getSuit() + " : " + c.getVal() + " : " + count;
                System.out.println(s);
            }
            count++;
        }
        
        System.out.println("Deck 2:");
        
        d2.shuffle();
        count = 0;
        for(int i = 0; i<53; i++){
            card c = d2.dealOneCard();
            if(c != null){
                String s = c.getSuit() + " : " + c.getVal() + " : " + count;
                System.out.println(s);
            }
            count++;
        }
    }
}
