import java.time.*;

public class Exercise2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate inAMonth = today.plusMonths(1);
        System.out.println(inAMonth);
    }
}
