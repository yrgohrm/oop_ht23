import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDate today = LocalDate.now();
            
            System.out.println("När är du född? yyyy-mm-dd");
            LocalDate dateOfBirth = getDateOfBirth(scanner);
            long daysOld = ChronoUnit.DAYS.between(dateOfBirth, today);

            if (daysOld < 0) {
                System.out.println("Du är inte född ännu!");
                return;
            }

            System.out.printf("Du är %d dagar gammal.%n", daysOld);
        }
        catch (DateTimeParseException ex) {
            System.out.println("Du skrev inte in ett datum :(");
        }
    }

    private static LocalDate getDateOfBirth(Scanner scanner) {
        final LocalDate today = LocalDate.now();

        while (true) {
            try {
                String dateOfBirthString = scanner.nextLine();
                LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
                if (!dateOfBirth.isAfter(today)) {
                    return dateOfBirth;
                }

                System.out.println("Datum i framtiden accepteras inte! Försök igen.");
            }
            catch (DateTimeParseException ex) {
                System.out.println("Du skrev inte in ett vettigt datum. Försök igen.");
            }
        }
    }   
}
