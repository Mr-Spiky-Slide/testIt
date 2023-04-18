package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class PokerGame {



    public PokerGame() {

    }

    /**
     * This goes through the array and finds two cards that are the same, only returns true if there's only one pair
     * @param hand
     * @return
     */
    public static boolean twoOfAKind(Card[] hand){
        Arrays.sort(hand, Comparator.comparingInt(Card::getValue));
        int numberOfMatches = 0;
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i].getValue() == (hand[i+1].getValue())) numberOfMatches ++;
        }
        if (numberOfMatches == 1) return true;

        return false;
    }

    /**
     * This goes through the array and finds two cards that are the same, only returns true if there are two pair
     * @param hand
     * @return
     */
    public static boolean twoPair(Card[] hand){
        Arrays.sort(hand, (a,b) -> a.getValue() - b.getValue());
        int numberOfMatches = 0;
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i].getValue() == (hand[i+1].getValue())) numberOfMatches ++;
        }
        if (numberOfMatches == 2) return true;

        return false;
    }

    /**
     * This goes through the array and finds three cards that are the same
     * @param hand
     * @return
     */
    public static boolean threeOfAKind(Card[] hand){
        Arrays.sort(hand, (a,b) -> a.getValue() - b.getValue());
        for (int i = 0; i < hand.length - 1; i++) {
            if ((hand[i].getValue() == hand[i+1].getValue()) && (hand[i].getValue() == hand[i+2].getValue())) return true;
        }
        return false;
    }

    /**
     * This goes through the array and finds three cards that are the same
     * @param hand
     * @return
     */
    public static boolean fourOfAKind(Card[] hand){
        Arrays.sort(hand, (a,b) -> a.getValue() - b.getValue());
        for (int i = 0; i < hand.length - 1; i++) {
            if ((hand[i].getValue() == hand[i+1].getValue()) && (hand[i].getValue() == hand[i+2].getValue()) && (hand[i].getValue() == hand[i+3].getValue())) return true;
        }
        return false;
    }

    /**
     * Uses a stream to map the suits of the array to another array, it counts how many distinct suits there are, if they are all the same suit then only one or less would be distinct
     * @param hand
     * @return
     */
    public static boolean flush(Card[] hand){
        return Arrays.stream(hand).map(Card::getSuit).distinct().count() <= 1;
    }

    /**
     * This goes through the array and finds three cards that are the same then checks if the last two are the same
     * @param hand
     * @return
     */
    public static boolean fullHouse(Card[] hand){
        Arrays.sort(hand, Comparator.comparingInt(Card::getValue));
            if (((hand[0].getValue() == hand[1].getValue()) && (hand[0].getValue() == hand[2].getValue()))  && (hand[3].getValue() == hand[4].getValue())) return true;

        return false;
    }

    /**
     *This goes through the sorted array and checks if the next card in the array is in sequence
     * @param hand
     * @return
     */
    public static boolean straight(Card[] hand){
        Arrays.sort(hand, Comparator.comparingInt(Card::getValue));
            if ((hand[0].getValue() == hand[1].getValue()+1) &&
                    (hand[0].getValue() == hand[2].getValue()+2) &&
                    (hand[0].getValue() == hand[3].getValue()+3) &&
                    (hand[0].getValue() == hand[4].getValue()+4)) return true;

        return false;
    }
}
