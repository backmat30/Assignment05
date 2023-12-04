package edu.cs2430.assignment5;

/**
 * class to represent a card
 */
public class Card {
    private Rank rank;
    private Suit suit;
    
    /**
     * copy constructor
     * @param otherCard card to be copied from
     */
    public Card(Card otherCard){

    }

    /**
     * constructs a card with the given rank and suit
     * @param rank card rank
     * @param suit card suit
     */
    public Card(Rank rank, Suit suit){

    }

    /**
     * compares the card with another card
     * @param otheCard the card compared with the current card
     * @return suit comparison if suits dont match, otherwise returns rank comparison
     */
    public int compareTo(Card otherCard){
        if(otherCard.getSuit() != suit){
            return suit.compareTo(otherCard.getSuit());
        }
        return rank.compareTo(otherCard.rank);
    }

    /**
     * returns string representation of the card
     */
    @Override
    public String toString(){
        return String.format("%s of %s", rank.toString(), suit.toString());
    }

    /**
     * gets the rank of the card
     * @return card rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * gets the suit of the card
     * @return card suit
     */
    public Suit getSuit() {
        return suit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rank == null) ? 0 : rank.hashCode());
        result = prime * result + ((suit == null) ? 0 : suit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (rank != other.rank)
            return false;
        if (suit != other.suit)
            return false;
        return true;
    }

    
}
