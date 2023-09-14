import java.util.*;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in starthöjden i meter:");
        double height = scanner.nextDouble();
        double startHeight = height;

        int bounce = 0; 

        while (height > 0.01) {
            height = height * 0.7;
            bounce++;
        }

        System.out.printf("Bollen studsar %d gånger från %.2f meter.%n", bounce, startHeight);
    }
}
