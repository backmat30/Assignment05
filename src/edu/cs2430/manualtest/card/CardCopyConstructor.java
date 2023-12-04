package edu.cs2430.manualtest.card;

import edu.cs2430.assignment5.Card;
import edu.cs2430.assignment5.Rank;
import edu.cs2430.assignment5.Suit;

// Prerequisites
// Rank
// Suit
// Card-Constructor
// Corequisites
// Card-toString (for the output)
public class CardCopyConstructor
{
    public static void main(String[] args)
    {
        for (Suit suit : Suit.values())
        {
            for (Rank rank : Rank.values())
            {
                Card card = new Card(rank, suit);
                Card copiedCard = new Card(card);
                System.out.println(copiedCard);
            }
        }
    }
}
