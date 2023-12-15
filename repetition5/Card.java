import java.util.*;

public record Card(Suit suit, int value) implements Comparable<Card> {
    public Card {
        Objects.requireNonNull(suit);
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("invalid card value");
        }
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    @Override
    public int compareTo(Card o) {
        Comparator<Card> comp = Comparator.comparing(Card::suit)
                                            .thenComparingInt(Card::value);
        return comp.compare(this, o);

        // int comp = this.suit.compareTo(o.suit);
        // if (comp != 0) {
        //     return comp;
        // }

        // return Integer.compare(this.value, o.value);


        // sort with aces high
        // int comp = this.suit.compareTo(o.suit);
        // if (comp != 0) {
        //     return comp;
        // }

        // if (this.value == o.value) {
        //     return 0;
        // }
        
        // if (this.value == 1) {
        //     return 1;
        // }
        // else if (o.value == 1) {
        //     return -1;
        // }
    
        // return this.value - o.value;
    }
}
