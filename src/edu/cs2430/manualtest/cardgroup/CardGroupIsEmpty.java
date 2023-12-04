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
public class CardGroupIsEmpty
{
    public static void main(String[] args)
    {
        CardGroup cardGroup = new CardGroup();
        System.out.println(cardGroup.isEmpty());

        cardGroup.addCard(new Card(Rank.ACE, Suit.HEARTS));
        System.out.println(cardGroup.isEmpty());
    }
}
