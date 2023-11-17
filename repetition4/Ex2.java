import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            mainWithScanner(scanner);
        }
    }

    private static void mainWithScanner(Scanner scanner) {
        List<String> names = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }

            names.add(name);
        }
    
        names.stream()
            .map(String::trim)
            .map(Ex2::removePeriod)
            .filter(s -> s.startsWith("H"))
            .forEach(System.out::println);
    }

    private static String removePeriod(String str) {
        char lastChar = str.charAt(str.length() - 1);
        if (lastChar == '.') {
            return str.substring(0, str.length() - 1);
        }

        return str;
    }
}
