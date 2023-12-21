package u1;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.util.*;

public class Assignment1 {

    record WordStats(int total, int unique) {}

    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.err.println("feeeeeel!");
                return;
            }

            Path infile = Path.of(args[0]);
            Path outfile = Path.of(args[1]);

            WordStats stats = countUnique(infile);
            writeToFile(stats, infile, outfile);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void writeToFile(WordStats stats, Path infile, Path outfile) throws IOException {
        try (BufferedWriter w = Files.newBufferedWriter(outfile)) {
            w.write("Filename: ");
            w.write(infile.toAbsolutePath().normalize().toString());
            w.newLine();

            w.write("Date: ");
            w.write(LocalDateTime.now().toString());
            w.newLine();

            w.write("Words processed: " + stats.total());
            w.newLine();

            w.write("Unique words: " + stats.unique());
            w.newLine();
        }
    }

    private static WordStats countUnique(Path file) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        int totalWordCount = 0;

        var allLines = Files.readAllLines(file);
        for (String line : allLines) {
            String[] words = line.split(" ");
            totalWordCount += words.length;

            for (String word : words) {
                String lowerCaseWord = word.toLowerCase();
                int seenCount = wordCount.getOrDefault(lowerCaseWord, 0);
                wordCount.put(lowerCaseWord, seenCount + 1);
            }
        }

        // nu är wordCount en lista över alla ord och hur ofta vi sett dem
        // totalWordCount är totala antalet ord

        int unique = 0;

        for (var count : wordCount.values()) {
            if (count == 1) {
                unique++;
            }
        }

        return new WordStats(totalWordCount, unique); // ?? hur returnerar vi två saker?
    }   
}