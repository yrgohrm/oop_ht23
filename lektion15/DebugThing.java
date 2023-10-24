import java.io.*;
import java.nio.file.*;
import java.util.*;

public class DebugThing {
    private static final List<String> badWords = new ArrayList<>();

    static {
        try (BufferedReader r = Files.newBufferedReader(Path.of("bad_words.txt"))) {
            while (r.readLine() != null) {
                String badWord = r.readLine();
                badWords.add(badWord.toLowerCase());
            }
        }
        catch (IOException ex) {
            // not very good error handling, but at least it's something
            ex.printStackTrace();
        }
    }

    public static String censor(String text) {
        StringBuilder output = new StringBuilder();

        // Don't worry too much about this regular expression,
        // it is advanced to say the least. Using lookahead and lookbehind. 
        // Basically splits a string into words *and* separators.
        String[] words = text.split("((?=\\W)|(?<=\\W))");

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (badWords.contains(word.toLowerCase())) {
                output.append("*".repeat(word.length()));
            }
            else {
                output.append(word);
            }
        }
        
        return output.toString();
    }

    public static void main(String[] args) {
        String censoredText = censor("Holy cowabunga dude. Egad! He said crikey that slimy fellow!");
        System.out.println(censoredText);
    }
}
