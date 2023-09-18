import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String answer;
        // do {
        //     System.out.println("Vill du fortsätta loopa?");
        //     answer = scanner.nextLine();
        // } while (answer.equalsIgnoreCase("ja"));

        // System.out.println("Vill du fortsätta loopa?");
        // String answer = scanner.nextLine();
        // for (;answer.equalsIgnoreCase("ja");) {
        //     System.out.println("Vill du fortsätta loopa?");
        //     answer = scanner.nextLine();
        // }

        // int num = scanner.nextInt();
        // int res = num * 22;
        // System.out.println(res);

        // num = scanner.nextInt();
        // res = num * 11;
        // System.out.println(res);

        // int foo = scanner.nextInt();
        // int bar = foo * 11;
        // System.out.println(bar);

        // for (int i = -10; i <= 10; i = i + 2) {
        //     System.out.println(i);
        // }

        for (int i = -10; i < 0; i += 2) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        // 2147483640
        // 2147483647

        for (int i = 2147483640; i < 2147483647; i++) {
            System.out.println(i);
        }
        System.out.println(2147483647);
    }
}
