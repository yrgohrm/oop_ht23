import java.util.*;

public class ScannerClose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        System.out.println(data);

        scanner.close();
    }
}