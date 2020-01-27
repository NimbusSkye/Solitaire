package ca.mcgill.cs.stg.solitaire.cards;

import java.util.Comparator;

public class ReverseComparator implements Comparator<Hand> {
    @Override
    public int compare(Hand hand, Hand t1) {
        return (-hand.compareTo(t1));
    }
}