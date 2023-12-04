package edu.cs2430.manualtest.card;

import edu.cs2430.assignment5.Card;
import edu.cs2430.assignment5.Rank;
import edu.cs2430.assignment5.Suit;

// Prerequisites
// Rank
// Suit
// Corequisites
// Card-toString (for the output)
public class CardConstructor
{
    public static void main(String[] args)
    {
        for (Suit suit : Suit.values())
        {
            for (Rank rank : Rank.values())
            {
                Card card = new Card(rank, suit);
                System.out.println(card);
            }
        }
    }
}
