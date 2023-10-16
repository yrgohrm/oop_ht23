import java.util.*;

public class ExceptionStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount;
        while (true) {
            System.out.println("Hur mycket skall läggas på presentkortet?");
            amount = scanner.nextDouble();
            if (amount > 0) {
                break;
            }
        }

        GiftCard card = new GiftCard(amount);
        System.out.println("Grattis... här får du: " + card);
    }
}
