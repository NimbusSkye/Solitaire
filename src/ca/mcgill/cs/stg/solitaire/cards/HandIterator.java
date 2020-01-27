package ca.mcgill.cs.stg.solitaire.cards;

import java.util.Iterator;
import java.util.List;

public class HandIterator implements Iterator<Hand> {
    private List<Hand> hList;
    public HandIterator (List<Hand> hList) {
        this.hList=hList;
    }

    @Override
    public boolean hasNext() {
        int index = hList.indexOf(this);
        return !(index==(hList.size()-1));
    }

    @Override
    public Hand next() {
        int index = hList.indexOf(this);
        return hList.get(index+1);
    }
}
