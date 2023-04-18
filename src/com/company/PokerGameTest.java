package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PokerGameTest {
    private Card[] hand;

    @Before
    public void setUp() throws Exception {
        hand = new Card[]{new Card(Suit.SPADE, 14, Face.ACE),
                new Card(Suit.SPADE, 2, Face.TWO),
                new Card(Suit.SPADE, 2, Face.TWO),
                new Card(Suit.SPADE, 2, Face.TWO),
                new Card(Suit.SPADE, 14, Face.ACE)
        };
    }

    @Test
    public void twoOfAKindTest(){
        assertFalse("Two of a kind should have matched", PokerGame.twoOfAKind(hand));
    }

    @Test
    public void twoPairTest(){
        assertTrue("Two sets of two of a kind should have matched.", PokerGame.twoPair(hand));
    }

    @Test
    public void threeOfAKindTest() { assertTrue("Three of a kind should have matched.", PokerGame.threeOfAKind(hand));}

    @Test
    public void fourOfAKindTest() { assertFalse("Four of a kind should have matched.", PokerGame.fourOfAKind(hand));}

    @Test
    public void flushTest() { assertTrue("A flush should have matched.", PokerGame.flush(hand));}

    @Test
    public void fullHouseTest() { assertTrue("A full house should have matched.", PokerGame.fullHouse(hand));}

    @Test
    public void straightTest() { assertFalse("A straight should have matched.", PokerGame.straight(hand));}
}
