import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.stream.*;

public class DifferentFiles {
    private static void oldSchoolRead() throws IOException {
        // opens a file input stream with a given filename
        // puts that into a InputStreamReader that converts the byte data into a character data
        // puts stat into a BufferedReader that will perform buffering for performance
        // we need to tell it to use UTF-8 as encoding
        try (BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("DifferentFiles.java"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = r.readLine()) != null) {
                printFirstNonBlank(line);
            }
            System.out.println();
        }
    }

    private static void oldSchoolShorter() throws IOException {
        // Use a FileReader which is basically like a InputStreamReader combined with a FileInputStream.
        // makes it a bit shorter
        try (BufferedReader r = new BufferedReader(new FileReader("DifferentFiles.java", StandardCharsets.UTF_8))) {
            String line;
            while ((line = r.readLine()) != null) {
                printFirstNonBlank(line);
            }
            System.out.println();
        }
    }

    private static void newClassic() throws IOException {
        // shorter still by using Files. It will also always assume UTF-8.
        try (BufferedReader r = Files.newBufferedReader(Path.of("DifferentFiles.java"))) {
            String line;
            while ((line = r.readLine()) != null) {
                printFirstNonBlank(line);
            }
            System.out.println();
        }
    }

    private static void newShort() throws IOException {
        // read all lines into a list, then loop over the list and call
        // printFirstNonBlank for each such line
        // if the file is big this will allocate a huge list in memory
        Files.readAllLines(Path.of("DifferentFiles.java")).forEach(DifferentFiles::printFirstNonBlank);
        System.out.println();
    }

    private static void newStream() throws IOException {
        // Use a stream. This will not read the entire file into memory, but
        // we do need to use the stream in a try-with-resources to make sure
        // it is closed properly in the end
        try (Stream<String> stream = Files.lines(Path.of("DifferentFiles.java"))) {
            stream.forEach(DifferentFiles::printFirstNonBlank);
            // stream.map(String::trim)
            //       .filter(Predicate.not(String::isBlank))
            //       .map(s -> s.substring(0, 1))
            //       .forEach(System.out::print);
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        oldSchoolRead();
        oldSchoolShorter();
        newClassic();
        newShort();
        newStream();
    }

    private static void printFirstNonBlank(String line) {
        if (line == null || line.isBlank()) {
            return;
        }

        System.out.print(line.trim().charAt(0));
    }
}
