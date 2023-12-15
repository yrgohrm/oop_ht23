public class DeckMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(deck);
        System.out.println();
        deck.sort();
        System.out.println(deck);
    }
}
