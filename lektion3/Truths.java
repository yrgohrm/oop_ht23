import java.util.*;

public class Truths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        System.out.println("Hur många husdjur har du?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        if (numberOfPets > 0 && age >= 18) {
            System.out.println("Är minst ett av djuren en hund? [ja/nej]");
            String hasDog = scanner.nextLine();

            if (hasDog.equalsIgnoreCase("ja") || hasDog.equalsIgnoreCase("yes")) {
                System.out.println("Tur att det inte bara är katter...");
            }
        }
        else {
            System.out.println("Hepp, synd!");
        }
    }
}
