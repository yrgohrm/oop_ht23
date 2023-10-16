import java.io.*;
import java.nio.file.*;

public class Ovn2 {
    public static void main(String[] args) {
        try (BufferedWriter w = Files.newBufferedWriter(Path.of("hello.txt"), StandardOpenOption.APPEND)) {
            // w.write("Hello, world!" + System.lineSeparator());
            w.write("Hello, world!");
            w.newLine();
        }
        catch (IOException ex) {
            System.out.println("Något gick snett!");
        }
    }
}
