import java.util.*;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett heltal:");
        int x = scanner.nextInt();

        System.out.println("Skriv in ett tal till:");
        int y = scanner.nextInt();
5
        System.out.printf("%d * %d = %d%n", x, y, x*y);
    }
}
