public class EqualMain {
    public static void main(String[] args) {
        Card c1 = new Card(Suit.HEARTS, 5);
        Card c2 = new Card(Suit.HEARTS, 5);

        if (c1.equals(c2)) {
            System.out.println("Samma kort!");
        }
        else {
            System.out.println("Olika kort!");
        }
    }
}
