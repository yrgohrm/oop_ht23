import java.util.function.*;

public class PreLambda {
    public static void main(String[] args) {

        Function<String, Boolean> func = String::isBlank;


        boolean b = func.apply("Hejsan");
        System.out.println("Hejsan is blank: " + b);

        b = func.apply("    ");
        System.out.println("    is blank: " + b);

        printIfTrueForHello(String::isBlank);
        printIfTrueForHello("Hello"::equalsIgnoreCase);

        Supplier<String> sup = () -> "Hejsan";
        
        System.out.println(sup.get());

    }

    private static void printIfTrueForHello(Function<String, Boolean> pred) {
        if (pred.apply("Hello")) {
            System.out.println("Hello!!!");
        }
    }
}
