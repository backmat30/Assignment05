package edu.cs2430.manualtest.game41util;

import edu.cs2430.assignment5.Game41Utils;
import edu.cs2430.assignment5.Card;
import edu.cs2430.assignment5.CardGroup;
import edu.cs2430.assignment5.Rank;
import edu.cs2430.assignment5.Suit;


// Prerequisites
// Rank
// Suit
// Card
// CardGroup
// Game41Utils-getPointValue
public class Game41UtilsCalculateHandValue
{

    public static void main(String[] args)
    {
        CardGroup hand = new CardGroup();
        hand.addCard(new Card(Rank.ACE, Suit.CLUBS));
        hand.addCard(new Card(Rank.NINE, Suit.DIAMONDS));
        hand.addCard(new Card(Rank.FIVE, Suit.DIAMONDS));
        hand.addCard(new Card(Rank.TWO, Suit.SPADES));

        System.out.println(Game41Utils.calculateHandValue(hand));


        CardGroup hand2 = new CardGroup();
        hand2.addCard(new Card(Rank.TWO, Suit.HEARTS));
        hand2.addCard(new Card(Rank.FIVE, Suit.HEARTS));
        hand2.addCard(new Card(Rank.SIX, Suit.HEARTS));
        hand2.addCard(new Card(Rank.SIX, Suit.SPADES));
        hand2.addCard(new Card(Rank.TEN, Suit.CLUBS));

        System.out.println(Game41Utils.calculateHandValue(hand2));

        CardGroup hand3 = new CardGroup();
        hand3.addCard(new Card(Rank.TWO, Suit.HEARTS));
        hand3.addCard(new Card(Rank.FIVE, Suit.HEARTS));
        hand3.addCard(new Card(Rank.SIX, Suit.HEARTS));
        hand3.addCard(new Card(Rank.SIX, Suit.SPADES));
        hand3.addCard(new Card(Rank.TWO, Suit.DIAMONDS));

        System.out.println(Game41Utils.calculateHandValue(hand3));

    }
}
