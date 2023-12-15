import java.util.*;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (int value = 1; value < 14; value++) {
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card c : cards) {
            sb.append(c);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }    
}
