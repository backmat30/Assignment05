package edu.cs2430.manualtest.cardgroup;

import edu.cs2430.assignment5.Card;
import edu.cs2430.assignment5.CardGroup;
import edu.cs2430.assignment5.Rank;
import edu.cs2430.assignment5.Suit;

// Prerequisites
// Rank
// Suit
// Card-Constructor
// Card-addCard
public class CardGroupEquals
{
    public static void main(String[] args)
    {
        CardGroup cardGroup1 = new CardGroup();
        CardGroup cardGroup2 = new CardGroup();
        cardGroup2.addCard(new Card(Rank.ACE, Suit.HEARTS));
        cardGroup1.addCard(new Card(Rank.ACE, Suit.HEARTS));

        System.out.println(cardGroup1.equals(cardGroup2));

        cardGroup1.addCard(new Card(Rank.KING, Suit.HEARTS));
        System.out.println(cardGroup1.equals(cardGroup2));
    }
}
