package edu.cs2430.assignment5;

/**
 * enum for the card suits
 */
public enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    /**
     * gets the string representation of the suit
     * @return returns the string representation of the suit
     */
    public String toString(){
        return name().toLowerCase();
    }
}
