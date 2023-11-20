import java.time.*;
import java.time.format.*;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yy-MM-dd DDD");

        System.out.println(today.format(fmt));
    }
}