import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in startvärde för fakulteten:");
        int value = scanner.nextInt();

        int result = 1;
        for (int i = 2; i <= value; i++) {
            result = result * i;
        }

        System.out.printf("Svaret är: %d%n", result);
    }
}
