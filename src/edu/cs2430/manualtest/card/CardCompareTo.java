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
public class CardCompareTo
{
    public static void main(String[] args)
    {
        for (Suit suit : Suit.values())
        {
            for (Rank rank : Rank.values())
            {
                Card card = new Card(rank, suit);

                for (Suit suit2 : Suit.values())
                {
                    for (Rank rank2 : Rank.values())
                    {
                        Card card2 = new Card(rank2, suit2);
                        System.out.println(card.compareTo(card2));
                    }
                }
            }
        }
    }
}
