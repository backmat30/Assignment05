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
// CardGroup-toString (for the output)
public class CardGroupRemoveCard
{
    public static void main(String[] args)
    {

        CardGroup cardGroup = new CardGroup();
        cardGroup.addCard(new Card(Rank.ACE, Suit.HEARTS));
        cardGroup.addCard(new Card(Rank.TWO, Suit.SPADES));
        cardGroup.addCard(new Card(Rank.THREE, Suit.DIAMONDS));
        cardGroup.addCard(new Card(Rank.FOUR, Suit.CLUBS));

        System.out.println(cardGroup.removeCard(1));
        System.out.println(cardGroup);
    }
}
