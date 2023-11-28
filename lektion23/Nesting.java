import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class Nesting {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        var aggregate = new TreeMap<LocalDateTime, Integer>();

        for (String file : args) {
            handleFile(aggregate, file);
        }

        if (aggregate.isEmpty()) {
            return;
        }

        try (BufferedWriter w = Files.newBufferedWriter(Path.of("output.log"))) {
            for (var entry : aggregate.entrySet()) {
                w.write(entry.getKey() + " " + entry.getValue());
                w.newLine();
            }
        }
        catch (IOException ex) {
            System.err.println("oops");
        }
    }

    private static void handleFile(TreeMap<LocalDateTime, Integer> aggregate, String file) {
        Path path = Path.of(file);
        if (!Files.isReadable(path)) {
            return;
        }

        try (BufferedReader r = Files.newBufferedReader(path)) {
            String line;
            while ((line = r.readLine()) != null) {
                handleLine(aggregate, line);
            }
        }
        catch (IOException ex) {
            System.err.println("oops");
        }
    }

    private static void handleLine(Map<LocalDateTime, Integer> aggregate, String line) {
        String[] parts = line.split(" ");
        if (parts.length != 2) {
            return;
        }

        try {
            LocalDateTime time = LocalDateTime.parse(parts[0]);
            Integer count = Integer.parseInt(parts[1]);
            aggregate.merge(time, count, (a, b) -> a + b);
        }
        catch (DateTimeParseException | NumberFormatException ex) {
            System.err.println("Invalid line: " + line);
        }
    }
}
