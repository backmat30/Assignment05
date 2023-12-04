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
public class CardGroupClear
{
    public static void main(String[] args)
    {
        CardGroup cardGroup1 = new CardGroup();
        cardGroup1.addCard(new Card(Rank.ACE, Suit.CLUBS));
        cardGroup1.addCard(new Card(Rank.ACE, Suit.DIAMONDS));

        cardGroup1.clear();

        // No output - empty group
        System.out.println(cardGroup1);
    }
}
