public class Card {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("jkhdsfjkhdfsjhkdf");
        }

        this.suit = suit;
        this.value = value;
        
    }


}

