package rep4;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class Ex3 {
    public static void main(String[] args) {
        Path infile = Path.of("rep4/ex1.txt");

        try (var lines = Files.lines(infile)) {
            lengthHandler(lines);
        }
        catch (IOException ex) {
            System.err.println("oops!");
        }
    }

    private static void lengthHandler(Stream<String> lines) {
        int totalLength = lengthOfAndLines(lines);
        System.out.println(totalLength);
    }

    private static int lengthOfAndLines(Stream<String> lines) {
        return lines.filter(line -> line.contains("and"))
            .mapToInt(String::length)
            .sum();
    }

    boolean someMethod(String line) {
        return line.contains("and");
    }

    void foo() {
        // ?????
    }
}
