import java.util.*;

public class EqualsObj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "ja";

        System.out.println("Skriv in något");
        String data = scanner.nextLine();

        if (data == answer) {
            System.out.println("Ja med ==");
        }

        if (data.equals(answer)) {
            System.out.println("Ja med equals");
        }

        scanner.close();
    }
}
