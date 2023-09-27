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

    private boolean playAgain = true;


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

        System.out.println("\nWelcome to Snap!");
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

        // keep player logic outside loop

        while (playAgain){

            resetDeck();
            System.out.println("\nPress Enter to start the game.");
            scanner.nextLine();

            Card previousCard = null;

            while (true) {
                Card currentCard = dealCard();

                if (currentCard == null) {
                    System.out.println("\nNo more cards in the deck. It's a draw!");
                    break;
                }

                System.out.println("\nCurrent Card: " + currentCard.getSuit() + currentCard.getStringValue());

                // old problem child

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
            System.out.println("\nGame Over!");
            System.out.println(player1.getName() + "'s Score: " + player1.getScore());
            System.out.println(player2.getName() + "'s Score: " + player2.getScore());

            snapInput = "";
            // resetting the boardState for future playing

            System.out.println("\nDo you want to play again? (yes/no)");
            String playAgainInput = scanner.nextLine().toLowerCase();
            if (playAgainInput.equals("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }

        System.out.println("\nThank you for playing");

        }


}
