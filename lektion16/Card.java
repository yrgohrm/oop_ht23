public class Card {
    private Suit suit;
    private int value;

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
    
}
