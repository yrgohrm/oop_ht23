public class CardMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        while (deck.size() > 0) {
            System.out.println(deck.draw());
        }
    }
}
