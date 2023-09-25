package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    private Scanner scanner;

    public Snap() {
        scanner = new Scanner(System.in);
    }

    public void playSnap() {
        shuffleDeck();
        System.out.println("\nWelcome to Solo Snap! Press Enter to start the game.");
        scanner.nextLine();

        Card previousCard = null;

        while (true) {
            Card currentCard = dealCard();

            if (currentCard == null) {
                System.out.println("\nNo more cards in the deck. It's a draw!");
                break;
            }

            System.out.println("\nCurrent Card: " + currentCard.getStringValue());

            if (previousCard != null && currentCard.getIntegerValue() == previousCard.getIntegerValue()) {
                System.out.println("\nSnap! You win!");
                break;
            }

            previousCard = currentCard;
            System.out.println("\nPress Enter for the next card...");
            scanner.nextLine();
        }

    }

}
