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
public class CardGroupGetCard
{
    public static void main(String[] args)
    {
        CardGroup cardGroup = new CardGroup();
        cardGroup.addCard(new Card(Rank.ACE, Suit.HEARTS));
        cardGroup.addCard(new Card(Rank.TWO, Suit.HEARTS));

        System.out.println(cardGroup.getCard(0));
        System.out.println(cardGroup.getCard(1));

    }
}
