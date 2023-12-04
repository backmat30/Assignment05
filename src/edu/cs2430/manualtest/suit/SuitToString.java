package edu.cs2430.manualtest.suit;

import edu.cs2430.assignment5.Suit;

// Prerequisites
// None
public class SuitToString
{
    public static void main(String[] args)
    {
        for (Suit suit : Suit.values())
        {
            System.out.println(suit);
        }
    }
}
