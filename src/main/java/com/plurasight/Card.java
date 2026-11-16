package com.plurasight;

public class Card {
    String suit;
    int value;
    boolean cardFace;


    Card(String suit,int value){
        this.suit = suit;
        this.value = value;
    }
    public void flip(){
        cardFace = true;
    }
}
