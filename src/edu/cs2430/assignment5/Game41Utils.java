package edu.cs2430.assignment5;

import java.util.Map;

/**
 * class containing utility methods for the game 41
 */
public class Game41Utils {
    /**
     * maps the ranks to their corresponding point values
     */
    private static Map<Rank, Integer> rankToPointMap;

    static{
        rankToPointMap.put(Rank.ACE, 11);
        rankToPointMap.put(Rank.TWO, 2);
        rankToPointMap.put(Rank.THREE, 3);
        rankToPointMap.put(Rank.FOUR, 4);
        rankToPointMap.put(Rank.FIVE, 5);
        rankToPointMap.put(Rank.SIX, 6);
        rankToPointMap.put(Rank.SEVEN, 7);
        rankToPointMap.put(Rank.EIGHT, 8);
        rankToPointMap.put(Rank.NINE, 9);
        rankToPointMap.put(Rank.TEN, 10);
        rankToPointMap.put(Rank.JACK, 10);
        rankToPointMap.put(Rank.QUEEN, 10);
        rankToPointMap.put(Rank.KING, 10);
    }

    /**
     * calculates the point value for a given hand
     * @param hand the hand being totalled
     * @return returns points for the given hand
     */
    public static int calculateHandValue(CardGroup hand){

    }

    /**
     * gets the point value associated with a given rank
     * @param rank the given rank
     * @return returns the point value for the rank
     */
    public static int getPointValue(Rank rank){

    }
    
    /**
     * determines if the round is over
     * @param deck current deck of cards
     * @param knockIndex index of the player who knocked
     * @param currentTurnIndex index of the current turn
     * @return returns true if the round is over, otherwise false
     */
    public static boolean isHandOver(CardGroup deck, int knockIndex, int currentTurnIndex){

    }
}