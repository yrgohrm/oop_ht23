import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UglyInteger {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        List<Integer> numbers = getTwoDifferent(scan);
        // this should never happen if Bosse does his job right...
        if (numbers.size() != 2 || numbers.get(0).equals(numbers.get(1))) {
            throw new RuntimeException("The function does not work...");
        }
        System.out.println("Two different numbers: " + numbers);
    }

    public static List<Integer> getTwoDifferent(final Scanner scan) {
        Integer i, j;
        do {
            System.out.println("Skriv in två tal som är olika:");
            i = scan.nextInt();
            j = scan.nextInt();
        } while (i == j);
        return Arrays.asList(i, j);
    }
}
