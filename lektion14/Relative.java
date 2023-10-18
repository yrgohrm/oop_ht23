import java.io.*;
import java.nio.file.*;

public class Relative {
    public static void main(String[] args) throws IOException {
        Path outputPath = Path.of("foo/apa.txt");
        Path inputPath = Path.of("foo/bepa.txt");

        try (BufferedWriter w = Files.newBufferedWriter(outputPath);
             BufferedReader r = Files.newBufferedReader(inputPath)) {
            String line = r.readLine();
            w.write(line);
        }
    }
}
