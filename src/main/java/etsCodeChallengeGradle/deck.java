/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsCodeChallengeGradle;
import java.util.*;


/**
 *
 * @author Austin Robbins
 */
public class deck {
    //constructor
    public deck(){
        rand = new Random();
        cards = new ArrayList<card>(52);
        
        values = new String[]{"2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King", "Ace"};
        
        suits = new String[]{"clubs", "diamonds", "hearts", "spades"};
        
        for(String s : suits){
            for(String v : values){
                cards.add(new card(v, s));
            }
        }
    }
    
    //sufficiently randomizes the order of cards in the deck
    public void shuffle(){
        for(int i=0; i<cards.size(); i++){
            int r = rand.nextInt(cards.size());
            while(r == i){
                r = rand.nextInt(cards.size());
            }
            Collections.swap(cards, i, r);
        }
    }
    
    //Deals a single card from the deck
    public card dealOneCard(){
        if(cards.size() > 0){
            return cards.remove(0);
        }
        return null;
    }
    
    //random generator for shuffling
    private Random rand;
    
    //collection of cards currently in deck
    private ArrayList<card> cards;
    
    //Array of all values to make constructing the deck easier
    private String[] values;
    //Array of all the suits to make constructing the deck easier
    private String[] suits;
}