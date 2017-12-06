/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsCodeChallengeGradle;


/**
 *
 * @author Austin Robbins
 */
public class card {
    //The value of the card
   private String val;
   
   //The suit of the card
   private String suit;
   
   //constructor
   //param v card value
   //param s card suit
   public card(String v, String s){
       val = v;
       suit = s;
   }
   
   public String getVal(){
       return val;
   }
   
   public String getSuit(){
       return suit;
   }
}
