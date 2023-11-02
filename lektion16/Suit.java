public enum Suit {
    HEARTS, SPADES, DIAMONDS, CLUBS;

    @Override
    public String toString() {
        return switch (this) {
            case HEARTS -> "♥";
            case SPADES -> "♠";
            case DIAMONDS -> "♦";
            case CLUBS -> "♣";
        };
    }
}
