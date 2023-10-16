import java.io.*;
import java.nio.file.*;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("xx.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

        // jättekrångligt att köra med finally istället
        BufferedReader r = null;
        try {
            r = Files.newBufferedReader(Path.of("bosse.txt"));

        }
        finally {
            if (r != null) {
                try {
                    r.close();
                }
                catch (IOException ex) {

                }
            }
        }
    }
}
