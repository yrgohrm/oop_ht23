import java.time.*;
import java.time.temporal.*;

public class Ex2PlusAfter {
    public static void main(String[] args) {
        LocalDateTime yesterday = LocalDateTime.now()
                                     .minusDays(1)
                                     .truncatedTo(ChronoUnit.DAYS);

        final LocalDateTime tomorrow = LocalDateTime.now()
                                    .plusDays(1)
                                    .truncatedTo(ChronoUnit.DAYS);

        System.out.println(yesterday);
        System.out.println(tomorrow);

        if (yesterday.isBefore(tomorrow)) {
            System.out.println("Yay! Time works!");
        }

        LocalDateTime tomorrowNoon = tomorrow.plusHours(12);
        System.out.println(tomorrowNoon);

        LocalDateTime betterNoon = tomorrow.withHour(12);
        System.out.println(betterNoon);
        System.out.println(tomorrow);
    }
}
