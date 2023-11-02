public class Card {
    private Suit suit;
    private int value;

    // this constructor is stupid
    public Card() {
        this(Suit.SPADES, 1);
    }

    public Card(Suit suit, int value) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("illegal card value");
        }

        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String valueString = switch (value) {
            case 1 -> { yield "A"; }
            case 11 -> { yield "J"; }
            case 12 -> { yield "Q"; }
            case 13 -> { yield "K"; }
            default -> { yield Integer.toString(value); }
        };

        return String.format("%s%s", suit, valueString);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((suit == null) ? 0 : suit.hashCode());
        result = prime * result + value;
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
        if (suit != other.suit)
            return false;
        return (value == other.value);
    }
    
    
}
