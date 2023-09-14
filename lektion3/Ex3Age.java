import java.util.Scanner;

public class Ex3Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Du är myndig.");
            System.out.println("Du börjar bli gammal...");

            System.out.println("Hur många öl dricker du en fredag?");
            int numberOfBeers = scanner.nextInt();
            if (numberOfBeers > 4) {
                System.out.println("Sök vård nu!!!!");
            }
        }
        else {
            System.out.println("Du är inte myndig ännu.");
            System.out.println("Ännu ung!");
        }

        System.out.println("Nu är det slut!");
    }
}
