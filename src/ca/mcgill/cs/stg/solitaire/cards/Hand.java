package ca.mcgill.cs.stg.solitaire.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> hand = new ArrayList<>();
    private int cap;

    public Hand (int cap) {
        this.cap = cap;
    }

    public List<Card> getHand () {
        return Collections.unmodifiableList(hand);
    }

    public void add (Card c) {
        if (isFull())
            return;
        hand.add(c);
    }

    public void remove (Card c) {
        hand.remove(c);
    }

    public boolean contains (Card c) {
        return hand.contains(c);
    }

    public boolean isEmpty () {
        return size() == 0;
    }

    public int size () {
        return hand.size();
    }

    public boolean isFull () {
        return size() == cap;
    }

    public String toString () {
        return hand.toString();
    }

    @Override
    public int compareTo(Hand h) {
        return Integer.compare(size(), h.size());
    }
}
