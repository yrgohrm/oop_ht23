import java.io.*;
import java.nio.file.*;

public class Ovn3 {
    public static void main(String[] args) {
        try (BufferedReader r = Files.newBufferedReader(Path.of("hello.txt"))) {
            // String line;
            // do {
            //     line = r.readLine();
            //     if (line != null) {
            //         System.out.println(line);
            //     }
            // } while (line != null);

            // while (true) {
            //     String line = r.readLine();
            //     if (line == null) {
            //         break;
            //     }
            //     System.out.println(line);
            // }

            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ex) {
            System.out.println("Det blev fel: " + ex.getMessage());
        }
    }
}
