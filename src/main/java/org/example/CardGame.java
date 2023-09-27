package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

abstract public class CardGame {
    private List<Card> deckOfCards;

    protected CardGame() {

        deckOfCards = new ArrayList<>();
        // Initialize the deck with all cards from the enum
        for (Card card : Card.values()) {
            deckOfCards.add(card);
        }

    }

    protected Card dealCard() {
        if (!deckOfCards.isEmpty()) {
            return deckOfCards.remove(0); // Remove and return the top card
        } else {
            return null; // simple null check to avoid error
        }
    }

    protected void sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (a, b) -> Integer.compare(a.getIntegerValue(), b.getIntegerValue()));
    }

    protected void sortDeckIntoSuits() {
        Collections.sort(deckOfCards, (a, b) -> {
            if (a.getSuit() == b.getSuit()) {
                return Integer.compare(a.getIntegerValue(), b.getIntegerValue());
            } else {
                return Character.compare(a.getSuit(), b.getSuit());
            }
        });
    }

    protected void shuffleDeck() {
        long seed = System.nanoTime();
        Collections.shuffle(deckOfCards, new Random(seed));
    }

    protected void resetDeck() {
        deckOfCards.clear(); // Clear the deck

        // Refill the deck
        for (Card card : Card.values()) {
            deckOfCards.add(card);
        }

        shuffleDeck(); // Shuffle the deck after refilling it
    }

    protected List<Card> getDeckOfCards() {
        return deckOfCards;
    }

    protected void setDeckOfCards(List<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

}
