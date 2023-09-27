package org.example;

import javax.management.timer.Timer;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Snap extends CardGame {
    private Player player1 = new Player("");
    private Player player2 = new Player("");
    private Player currentPlayer;
    private Scanner scanner;

    private long timer;

    private String snapInput = "";
    private String beforeSnapInput = "";


    public Snap() {
        currentPlayer = player1; // Player 1 starts
        scanner = new Scanner(System.in);
    }

    private boolean fiveSeconds() {

        long currentTime = System.currentTimeMillis();

        long timeElapsed = currentTime - timer;

        return timeElapsed >= 5000;
    }


    public void playSnap() {

        shuffleDeck();
        System.out.println("\nWelcome to Snap! Press Enter to start the game.");
        scanner.nextLine();
        System.out.println("\nPlease enter the name of player one:");
        String playerOneName = scanner.nextLine();
        while (playerOneName.isEmpty()) {
            System.out.println("\nName cannot be empty");
            System.out.print("\nPlease enter the name of player one:");
            playerOneName = scanner.nextLine();
        }
        player1.setName(playerOneName);
        System.out.println("\nPlease enter the name of player two:");
        String playerTwoName = scanner.nextLine();
        while (playerTwoName.isEmpty()) {
            System.out.println("\nName cannot be empty");
            System.out.print("\nPlease enter the name of player two:");
            playerTwoName = scanner.nextLine();
        }
        player2.setName(playerTwoName);


        Card previousCard = null;

        while (true) {
            Card currentCard = dealCard();

            if (currentCard == null) {
                System.out.println("\nNo more cards in the deck. It's a draw!");
                break;
            }

            System.out.println("\nCurrent Card: " + currentCard.getStringValue());





            // current problem child

            if (previousCard != null && currentCard.getIntegerValue() == previousCard.getIntegerValue() && !snapInput.equals("snap")) {

                timer = System.currentTimeMillis();

                while (!fiveSeconds()){
                    System.out.println("what is it?");
                    beforeSnapInput = scanner.nextLine();
                    if (beforeSnapInput.equals("snap")) {
                        break;
                    } else if (fiveSeconds()) {
                        break;
                    }
                }

                if (!fiveSeconds()) {
                    snapInput = beforeSnapInput;
                } else {
                    System.out.println("gotta be quicker");
                }


            }


            if (previousCard != null && currentCard.getIntegerValue() == previousCard.getIntegerValue() && snapInput.equals("snap")) {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
                System.out.println("\nSnap! " + currentPlayer.getName() + " wins!");
                currentPlayer.incrementScore();
                break;
            }

            System.out.println("\n" + currentPlayer.getName() + ", press Enter for the next card...");
            scanner.nextLine();


            previousCard = currentCard;


            // Switch to the other player's turn
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        // show the scores (obviously)
        System.out.println("Game Over!");
        System.out.println(player1.getName() + "'s Score: " + player1.getScore());
        System.out.println(player2.getName() + "'s Score: " + player2.getScore());
    }


}
