package edu.cs2430.manualtest.game41util;

import edu.cs2430.assignment5.Game41Utils;
import edu.cs2430.assignment5.Rank;

// Prerequisites
// Rank
// Suit
// Card
// CardGroup
public class Game41UtilsGetPointValue
{
    public static void main(String[] args)
    {
        for(Rank rank : Rank.values())
        {
            // Need to change method scope to public to test
            System.out.println(Game41Utils.getPointValue(rank));
        }

    }
}
