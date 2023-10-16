import java.io.*;
import java.nio.file.*;

public class Ovn1 {
    public static void main(String[] args) {
        try (BufferedWriter w = Files.newBufferedWriter(Path.of("hello.txt"))) {
            w.write("Hello, world!");
        }
        catch (IOException ex) {
            System.out.println("Något gick snett!");
        }
    }
}
