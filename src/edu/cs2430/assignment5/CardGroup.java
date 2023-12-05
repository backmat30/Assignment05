package edu.cs2430.assignment5;

import java.util.List;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * class representing a group of cards
 */
public class CardGroup {
    private List<Card> cardList;

    /**
     * default constructor, sets cardList to an empty list
     */
    public CardGroup() {
        cardList = new ArrayList<>();
    }

    /**
     * copy constructor
     * 
     * @param otherGroup cardGroup to be copied from
     */
    public CardGroup(CardGroup otherGroup) {
        for (int i = 0; i < otherGroup.size(); i++) {
            cardList.add(otherGroup.getCard(i));
        }
    }

    /**
     * adds a card to the group
     * 
     * @param card card to be added
     */
    public void addCard(Card card) {
        cardList.add(card);
    }

    /**
     * clears the card list
     */
    public void clear() {
        cardList = new ArrayList<>();
    }

    /**
     * gets the card at the specified index
     * 
     * @param index index of card
     * @return returns card at the index given
     */
    public Card getCard(int index) {
        return cardList.get(index);
    }

    /**
     * gets the last card in the group
     * 
     * @return returns the last card in the group
     */
    public Card getLastCard() {
        if (cardList.size() == 0) {
            return null;
        }
        return cardList.get(cardList.size() - 1);
    }

    /**
     * determines if the group is empty
     * 
     * @return returns true if empty otherwise false
     */
    public boolean isEmpty() {
        return cardList.size() == 0;
    }

    /**
     * removes a card at the given index
     * 
     * @param index index to remove card at
     * @return returns the removed card
     */
    public Card removeCard(int index) {
        return cardList.remove(index);
    }

    /**
     * removes the last card in the group
     * 
     * @return returns the removed card
     */
    public Card removeLastCard() {
        if (cardList.size() == 0) {
            return null;
        }
        return cardList.remove(cardList.size() - 1);
    }

    /**
     * shuffles the group of cards
     * 
     * @param random random object to use for shuffling
     */
    public void shuffle(Random random) {
        for (int i = cardList.size() - 1; i > 0; i--) {
            Card currentCard = cardList.get(i);
            int swapIndex = random.nextInt(i);
            cardList.set(i, cardList.get(swapIndex));
            cardList.set(swapIndex, currentCard);
        }
    }

    /**
     * gets the size of the group
     * 
     * @return returns the size of the card list
     */
    public int size() {
        return cardList.size();
    }

    /**
     * sorts the card group
     */
    public void sort() {
        cardList.sort(null);
    }

    /**
     * gets the string representation of the card group
     * 
     * @return returns the string representation of the card group
     */
    public String toString() {
        String output = "";
        for (Card card : cardList) {
            output += card.toString() + " ";
        }
        return output;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardList == null) ? 0 : cardList.hashCode());
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
        CardGroup other = (CardGroup) obj;
        if (cardList == null) {
            if (other.cardList != null)
                return false;
        } else if (!cardList.equals(other.cardList))
            return false;
        return true;
    }

}
