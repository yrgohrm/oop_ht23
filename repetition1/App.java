import java.util.*;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) {
        // här skapar vi vår enda scanner i hela programmet
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // här skickar vi en referens till den enda scannern
            // vidare till playGame så den också kan läsa användarens
            // input
            int gameScore = playGame(scanner);
    
            System.out.printf("Du fick %d poäng!%n", gameScore);
            System.out.println("Du fick " + gameScore + "poäng");
    
            System.out.println("Vill du spela ett spel till? [ja/nej]");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("nej")) {
                break;
            }
        }

        scanner.close();

        // nu har du vunnit
        // Highscore score = new Highscore("Bosse", 1000, "2023-09-22");


        // System.out.println("Nuvarande highscore:");
        // System.out.println("Namn: " + score.getName());
        // System.out.println("Poäng: " + score.getScore());
        // System.out.println("Datum: " + score.getDate());

        // System.out.printf("""
        //         Hej %s!

        //         Det var trevligt att träffas. Översänder %.2f kronor idag.

        //         Mvh
        //         %s
        //         """, "Lena", 120.5, "Hampus");

    }

    private static int playGame(Scanner playerInput) {
        int targetNumber = ThreadLocalRandom.current().nextInt(1, 11);
        int currentScore = 10;

        System.out.println("Jag har valt ett tal 1-10! Försök gissa!");

        while (true) {
            System.out.println("Din gissning?");
            int guess = playerInput.nextInt();
            playerInput.nextLine();

            if (guess == targetNumber) {
                // rätt gissning
                System.out.println("Rätt gissat!");
                break;
            }
            else if (guess < targetNumber) {
                // gissade för lågt
                System.out.println("Du gissade för lågt...");
                currentScore--;
            }
            else {
                // gissade för högt
                System.out.println("Du gissade för högt...");
                currentScore--;
            }
        }

        return currentScore;
    }
}
