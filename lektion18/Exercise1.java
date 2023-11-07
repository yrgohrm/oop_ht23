import java.util.*;
import java.util.concurrent.*;

public class Exercise1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            mainWithScanner(scanner);
        }
    }

    private static void mainWithScanner(Scanner scanner) {
        Collection<String> contestants = new ArrayList<>();

        String mode = System.getProperty("lotteryMode");
        if (mode != null && mode.equals("single-entry")) {
            contestants = new HashSet<>();
        }

        System.out.println("Mata in alla tävlande, avsluta med nyrad:");
        while (true) {
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }

            if (!contestants.add(name)) {
                System.out.println("Du finns redan med din fuskis!");
            }
        }

        String name = findRandom(contestants);
        System.out.println("Vinnaren är: " + name);
    }

    private static String findRandom(Collection<String> data) {
        int random = ThreadLocalRandom.current().nextInt(data.size());

        Iterator<String> iterator = data.iterator();
        for (int i = 0; i < random; i++) {
            iterator.next();
        }

        return iterator.next();
    }
}
