import java.util.*;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välj en siffra 1-3:");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Du valde ettan!");
                break;
            case 2:
                System.out.println("Du valde tvåan");
                break;
            case 3:
                System.out.println("Du valde trean");
                break;
            default:
                System.out.println("Ogiltigt val, skärp dig!");
        }

        scanner.close();
    }
}
