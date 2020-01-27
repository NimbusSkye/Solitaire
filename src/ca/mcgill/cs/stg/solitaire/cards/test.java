package ca.mcgill.cs.stg.solitaire.cards;
import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        Hand h1 = new Hand(2);
        Hand h2 = new Hand(3);
        Hand h3 = new Hand(3);
        h1.add(new Card(Rank.KING, Suit.DIAMONDS));
        h1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        h2.add(new Card(Rank.FIVE, Suit.SPADES));
        h2.add(new Card(Rank.FIVE, Suit.HEARTS));
        h2.add(new Card(Rank.FIVE, Suit.DIAMONDS));
        h3.add(new Card(Rank.KING, Suit.DIAMONDS));
        h3.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        h3.add(new Card(Rank.FIVE, Suit.SPADES));

    }
}
