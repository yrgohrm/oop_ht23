import java.io.*;
import java.nio.file.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = Files.newBufferedReader(Path.of("xx.txt"));
        String line = r.readLine();

        BufferedWriter w = Files.newBufferedWriter(Path.of("yy.txt"),
                                                    StandardOpenOption.APPEND);
        w.write(line);
        w.close();
    }
}
