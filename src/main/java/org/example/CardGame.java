package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardGame {
    private List<Card> deckOfCards;

    public CardGame() {

        deckOfCards = new ArrayList<>();
        // Initialize the deck with all cards from the enum
        for (Card card : Card.values()) {
            deckOfCards.add(card);
        }

    }

    public Card dealCard() {
        if (!deckOfCards.isEmpty()) {
            return deckOfCards.remove(0); // Remove and return the top card
        } else {
            return null; // simple null check to avoid error
        }
    }

    public void sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (a, b) -> Integer.compare(a.getIntegerValue(), b.getIntegerValue()));
    }

    public void sortDeckIntoSuits() {
        Collections.sort(deckOfCards, (a, b) -> {
            if (a.getSuit() == b.getSuit()) {
                return Integer.compare(a.getIntegerValue(), b.getIntegerValue());
            } else {
                return Character.compare(a.getSuit(), b.getSuit());
            }
        });
    }

    public void shuffleDeck() {
        long seed = System.nanoTime();
        Collections.shuffle(deckOfCards, new Random(seed));
    }

    public List<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(List<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public static void main(String[] args) {
        CardGame cardDeck = new CardGame();

        System.out.println("\nOriginal Deck:");
        cardDeck.getDeckOfCards().forEach(card -> System.out.println(card.getStringValue()));

        System.out.println("\nShuffled Deck:");
        cardDeck.shuffleDeck();
        cardDeck.getDeckOfCards().forEach(card -> System.out.println(card.getStringValue()));

        System.out.println("\nSorted Deck by Number:");
        cardDeck.sortDeckInNumberOrder();
        cardDeck.getDeckOfCards().forEach(card -> System.out.println(card.getStringValue()));

        System.out.println("\nSorted Deck into Suits:");
        cardDeck.sortDeckIntoSuits();
        cardDeck.getDeckOfCards().forEach(card -> System.out.println(card.getStringValue()));
    }
}
