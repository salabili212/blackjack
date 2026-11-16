package com.plurasight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList <Card> cards = new ArrayList<>();
    Random random;
    Deck(){
        String[] suits = {"J","Q","K"};
        for (int i = 1; i <= 4; i++){
            for (int j = 2; j <= 10; j++){
                Card card;
                //This will create 2, 3, 4, 5, 6, 7, 8, 9, 10 for each suit of ♥,♦,♣, ♠
                if (i == 1){
                    card = new Card((j + "♥"), j);
                    cards.add(card);
                } else if (i == 2) {
                    card = new Card((j + "♦"), j);
                    cards.add(card);
                }else if (i == 3){
                    card = new Card((j + "♣"), j);
                    cards.add(card);
                }else if (i == 4){
                    card = new Card((j + "♠"), j);
                    cards.add(card);
                }



                //This will create the J, Q, K, A cards
                if(i == 1 && (j <= 5)){
                    if(j <= 4) {
                        card = new Card((suits[j - 2] + "♥"),10);
                        cards.add(card);
                    }else{
                        card = new Card("A♥",11);
                        cards.add(card);
                    }
                }else if (i == 2 && (j <= 5)){
                    if(j <= 4) {
                        card = new Card((suits[j - 2] + "♦"),10);
                        cards.add(card);
                    }else{
                        card = new Card("A♦",11);
                        cards.add(card);
                    }
                }else if (i == 3 && (j <= 5)){
                    if(j <= 4) {
                        card = new Card((suits[j - 2] + "♣"),10);
                        cards.add(card);
                    }else{
                        card = new Card("A♣",11);
                        cards.add(card);
                    }
                }else if (i == 4 && (j <= 5)){
                    if(j <= 4) {
                        card = new Card((suits[j - 2] + "♠"),10);
                        cards.add(card);
                    }else{
                        card = new Card("A♠",11);
                        cards.add(card);
                    }
                }

            }

        }
    }
    public Card shuffle(){
        Collections.shuffle(cards);
        return cards.get(0);
    }

}
