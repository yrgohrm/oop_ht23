import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("en-GB");
        
        if (args.length == 1) {
            locale = Locale.forLanguageTag(args[0]);
        }

        ResourceBundle bundle = ResourceBundle.getBundle("ex1", locale);

        try (Scanner scanner = new Scanner(System.in).useLocale(locale)) {
            double num1 = readNumber(scanner, bundle);
            double num2 = readNumber(scanner, bundle);
            double num3 = readNumber(scanner, bundle);

            double mean = (num1+num2+num3) / 3.0;

            System.out.printf(locale, bundle.getString("mean_is"), mean);
        }
    }

    private static double readNumber(Scanner scanner, ResourceBundle bundle) {
        while (true) {
            try {
                System.out.print(bundle.getString("input_number"));
                return scanner.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.println(bundle.getString("not_a_number"));
                scanner.nextLine();
            }
        }
    }
}
