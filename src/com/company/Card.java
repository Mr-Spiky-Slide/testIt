package com.company;

public class Card {

    private Suit suit;
    private int value;
    private Face face;
    private static final int maxValue = 14;

    private static final int minValue = 2;

    public Card(Suit suit, int value, Face face) {
        this.suit = suit;
        this.value = value;
        this.face = face;
    }

    /**
     * returns the suit of the card
     * @return
     */
    public Suit getSuit() {
        return suit;
    }



    /**
     * returns the value of the card
     * @return
     */
    public int getValue() {
        return value;
    }


}
