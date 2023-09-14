import java.util.*;

public class AgesBad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        if (age < 3) {
            System.out.println("Du är liten");
        }

        if (age < 15) {
            System.out.println("Du är ung!");
        }
        
        if (age < 30) {
            System.out.println("Det blir inte bättre än så här!");
        }
        else {
            System.out.println("Ta det lugnt så du inte skadar dig...");
        }
    }
}
