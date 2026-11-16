package com.plurasight;

import java.util.ArrayList;

public class Hand {
    private int total;
    ArrayList<Card> cards = new ArrayList<>();

    public void deal (Card card){
       cards.add(card);
    }

    public int getValue(){
        return cards.get(0).value + cards.get(1).value;
    }
    public int getSize(){
        return cards.size();
    }








}
