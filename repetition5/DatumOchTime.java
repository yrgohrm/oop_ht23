import java.time.*;
import java.time.format.*;

public class DatumOchTime {
    public static void main(String[] args) {
        Instant i = Instant.now();
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Stockholm"));
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Australia/Adelaide"));

        System.out.println(i);
        System.out.println(ldt);
        System.out.println(zdt);
        System.out.println(zdt2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd yyyy 'apa' MM HH-ss-mm");
        System.out.println(ldt.format(dtf));

    }
}
