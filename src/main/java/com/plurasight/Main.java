package com.plurasight;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Interface of the game
        Scanner scanner = new Scanner(System.in);
        System.out.println("******** BLACKJACK ********");
        System.out.println("Enter player 1 name:");
        String firstPlayer = scanner.next();
        System.out.println("Enter player 2 name:");
        String secondPlayer = scanner.next();

        Deck deck = new Deck();
        Hand firstHand = new Hand();
        Hand secondHand = new Hand();
        //Pass
        firstHand.deal(deck.shuffle());
        firstHand.deal(deck.shuffle());
        int player1Total = firstHand.getValue();
        //second hand
        secondHand.deal(deck.shuffle());
        secondHand.deal(deck.shuffle());
        int player2Total = secondHand.getValue();


        System.out.println(firstHand.getSize());
        System.out.println(secondHand.getSize());
        System.out.println(firstPlayer + "'s cards:\n" + firstHand.cards.get(0).suit
                + " _ " +firstHand.cards.get(0).value + " Points");
        System.out.println(firstHand.cards.get(1).suit
                + " _ " +firstHand.cards.get(1).value + " Points\nTotal:" + player1Total);

        System.out.println(secondPlayer + "'s cards:\n" + secondHand.cards.get(0).suit
                + " _ " +secondHand.cards.get(0).value + " Points");
        System.out.println(secondHand.cards.get(1).suit
                + " _ " +secondHand.cards.get(1).value + " Points\nTotal:" + player2Total);


        if (player1Total > player2Total){
            System.out.println(firstPlayer + " wins with " + player1Total + " points!");
        } else if (player2Total > player1Total) {
            System.out.println(secondPlayer + " wins with " + player2Total + " points!");
        }else{
            System.out.println("It’s a tie!....");
        }


    }

}
