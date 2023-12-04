package edu.cs2430.assignment5;

/**
 * Enum for the card ranks
 */
public enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    /**
     * gets the string representation of the rank
     * @return Returns the string representation of the rank
     */
    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
