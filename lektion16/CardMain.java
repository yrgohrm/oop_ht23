public class CardMain {
    public static void main(String[] args) {
        Card c1 = new Card(Suit.DIAMONDS, 13);
        Card c2 = new Card(Suit.SPADES, 1);
        Card c3 = new Card(Suit.CLUBS, 5);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
