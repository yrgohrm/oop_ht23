import java.time.*;

public class Exercise3 {
    public static void main(String[] args) {
        ZoneId swedishTimeZone = ZoneId.of("Europe/Stockholm");
        ZonedDateTime gothenburg = ZonedDateTime.now(swedishTimeZone);

        ZoneId newYorkTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime newYork = ZonedDateTime.now(newYorkTimeZone);

        System.out.println(gothenburg);
        System.out.println(newYork);
    }
}
