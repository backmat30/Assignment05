package edu.cs2430.manualtest.cardgroup;

import edu.cs2430.assignment5.Card;
import edu.cs2430.assignment5.CardGroup;
import edu.cs2430.assignment5.Rank;
import edu.cs2430.assignment5.Suit;

// Prerequisites
// Rank
// Suit
// Card
// CardGroup-Constructor
// CardGroup-toString
// Corequisite
// CardGroup-addCard
public class CardGroupCopyConstructor
{
    public static void main(String[] args)
    {
        CardGroup cardGroup = new CardGroup();
        cardGroup.addCard(new Card(Rank.ACE, Suit.HEARTS));
        cardGroup.addCard(new Card(Rank.JACK, Suit.DIAMONDS));
        cardGroup.addCard(new Card(Rank.TWO, Suit.SPADES));
        cardGroup.addCard(new Card(Rank.TEN, Suit.CLUBS));

        CardGroup cardGroup2 = new CardGroup(cardGroup);
        cardGroup2.addCard(new Card(Rank.QUEEN, Suit.HEARTS));

        System.out.println(cardGroup);

    }
}
