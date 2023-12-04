package edu.cs2430.manualtest.cardgroup;

import edu.cs2430.assignment5.Card;
import edu.cs2430.assignment5.CardGroup;
import edu.cs2430.assignment5.Rank;
import edu.cs2430.assignment5.Suit;

import java.util.Random;

// Prerequisites
// Rank
// Suit
// Card-Constructor
// Card-addCard
// Card-toString
public class CardGroupRandomShuffle
{
    public static void main(String[] args)
    {
        CardGroup cardGroup = new CardGroup();
        cardGroup.addCard(new Card(Rank.ACE, Suit.HEARTS));
        cardGroup.addCard(new Card(Rank.TWO, Suit.HEARTS));
        cardGroup.addCard(new Card(Rank.THREE, Suit.HEARTS));

        cardGroup.shuffle(new Random(5));

        System.out.println(cardGroup);
    }
}
