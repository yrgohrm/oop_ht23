import java.util.Scanner;

public class Ex2Multiplication {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Vilken gångertabell vill du se?");
        int tabell = scanner.nextInt();

        int tableWidth = Integer.toString(tabell).length();
        int productWidth = Integer.toString(tabell * 10).length();
        String format = "%" + tableWidth + "d x %2d = %" + productWidth + "d%n";

        for (int i = 1; i <= 10; ++i) {
            int produkt = i * tabell;
            System.out.printf(format, tabell, i, produkt);
        }
    }
}
