import java.time.*;
import java.time.temporal.*;

public class Exercise4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfYear = LocalDate.of(today.getYear()+1, 1, 1);

        long days = ChronoUnit.DAYS.between(today, firstDayOfYear);
        System.out.println(days);
    }
}
