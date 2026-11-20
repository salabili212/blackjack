package com.plurasight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player 1's name: ");
        String firstPlayer = scanner.nextLine().trim();

        System.out.print("Enter player 2's name: ");
        String secondPlayer = scanner.nextLine().trim();

        String playAgain;

        do {
            Deck deck = new Deck();
            deck.shuffle();

            Hand firstHand = new Hand();
            Hand secondHand = new Hand();

            firstHand.deal(deck.deal());
            secondHand.deal(deck.deal());
            firstHand.deal(deck.deal());
            secondHand.deal(deck.deal());

            int player1Total = firstHand.getValue();
            int player2Total = secondHand.getValue();

            System.out.println("\n" + firstPlayer + "'s hand:");
            for (Card card : firstHand.cards) {
                System.out.println(card.suit + " - " + card.value + " points");
            }
            System.out.println("Total: " + player1Total);

            System.out.println("\n" + secondPlayer + "'s hand:");
            for (Card card : secondHand.cards) {
                System.out.println(card.suit + " - " + card.value + " points");
            }
            System.out.println("Total: " + player2Total);

            if (player1Total > 21 && player2Total > 21) {
                System.out.println("\nBoth players busted!");
            } else if (player2Total > 21 || (player1Total <= 21 && player1Total > player2Total)) {
                System.out.println("\n" + firstPlayer + " wins with " + player1Total + " points!");
            } else if (player1Total > 21 || player2Total > player1Total) {
                System.out.println("\n" + secondPlayer + " wins with " + player2Total + " points!");
            } else {
                System.out.println("\nIt's a tie!");
            }

            System.out.print("\nPlay again? (y/n): ");
            playAgain = scanner.nextLine().trim();
        } while (playAgain.equalsIgnoreCase("y"));
    }
}