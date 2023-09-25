package org.example;

public enum Card {
    HEARTS_2('\u2665', "2", 2),
    HEARTS_3('\u2665', "3", 3),
    HEARTS_4('\u2665', "4", 4),
    HEARTS_5('\u2665', "5", 5),
    HEARTS_6('\u2665', "6", 6),
    HEARTS_7('\u2665', "7", 7),
    HEARTS_8('\u2665', "8", 8),
    HEARTS_9('\u2665', "9", 9),
    HEARTS_10('\u2665', "10", 10),
    HEARTS_J('\u2665', "J", 11),
    HEARTS_Q('\u2665', "Q", 12),
    HEARTS_K('\u2665', "K", 13),
    HEARTS_A('\u2665', "A", 14),

    CLUBS_2('\u2663', "2", 2),
    CLUBS_3('\u2663', "3", 3),
    CLUBS_4('\u2663', "4", 4),
    CLUBS_5('\u2663', "5", 5),
    CLUBS_6('\u2663', "6", 6),
    CLUBS_7('\u2663', "7", 7),
    CLUBS_8('\u2663', "8", 8),
    CLUBS_9('\u2663', "9", 9),
    CLUBS_10('\u2663', "10", 10),
    CLUBS_J('\u2663', "J", 11),
    CLUBS_Q('\u2663', "Q", 12),
    CLUBS_K('\u2663', "K", 13),
    CLUBS_A('\u2663', "A", 14),

    DIAMONDS_2('\u2666', "2", 2),
    DIAMONDS_3('\u2666', "3", 3),
    DIAMONDS_4('\u2666', "4", 4),
    DIAMONDS_5('\u2666', "5", 5),
    DIAMONDS_6('\u2666', "6", 6),
    DIAMONDS_7('\u2666', "7", 7),
    DIAMONDS_8('\u2666', "8", 8),
    DIAMONDS_9('\u2666', "9", 9),
    DIAMONDS_10('\u2666', "10", 10),
    DIAMONDS_J('\u2666', "J", 11),
    DIAMONDS_Q('\u2666', "Q", 12),
    DIAMONDS_K('\u2666', "K", 13),
    DIAMONDS_A('\u2666', "A", 14),

    SPADES_2('\u2660', "2", 2),
    SPADES_3('\u2660', "3", 3),
    SPADES_4('\u2660', "4", 4),
    SPADES_5('\u2660', "5", 5),
    SPADES_6('\u2660', "6", 6),
    SPADES_7('\u2660', "7", 7),
    SPADES_8('\u2660', "8", 8),
    SPADES_9('\u2660', "9", 9),
    SPADES_10('\u2660', "10", 10),
    SPADES_J('\u2660', "J", 11),
    SPADES_Q('\u2660', "Q", 12),
    SPADES_K('\u2660', "K", 13),
    SPADES_A('\u2660', "A", 14);

    private final char suit;
    private final String stringValue;
    private final int integerValue;

    Card(char suit, String stringValue, int integerValue) {
        this.suit = suit;
        this.stringValue = stringValue;
        this.integerValue = integerValue;
    }

    public char getSuit() {
        return suit;
    }

    public String getStringValue() {
        return stringValue;
    }

    public int getIntegerValue() {
        return integerValue;
    }
}

