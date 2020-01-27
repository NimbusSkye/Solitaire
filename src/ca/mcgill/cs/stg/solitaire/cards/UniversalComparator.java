package ca.mcgill.cs.stg.solitaire.cards;

import java.util.Comparator;

public class UniversalComparator implements Comparator<Hand> {
    public enum type {Normal, Reverse}
    private type mode;
    UniversalComparator (type c) {
        mode=c;
    }
    @Override
    public int compare(Hand hand, Hand t1) {
        if(mode==type.Normal)
            return hand.compareTo(t1);
        return -(hand.compareTo(t1));
    }
}
