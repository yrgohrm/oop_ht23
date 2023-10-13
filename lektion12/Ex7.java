import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Ex2Fac.fac(scanner.nextInt());
        }
        finally {
            System.out.println("After try and catch");
        }

        System.out.println("After all");
    }
}
