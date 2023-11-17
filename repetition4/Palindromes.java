import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Palindromes {

    public static Set<String> readAllPalindromes(String fileName) {
        try (var lineStream = Files.lines(Path.of(fileName))) {
            return lineStream.filter(Palindromes::isPalindrome).collect(Collectors.toSet());
        }
        catch (IOException ex) {
            throw new UncheckedIOException(ex);
            // System.err.println("An error occured reading a file: " + ex.getMessage());
            // return Set.of();
        }
    }

    private static boolean isPalindrome(String str) {
        String cleanString = str.replaceAll("[\\s\\p{Punct}]", "");
    
        StringBuilder sb = new StringBuilder(cleanString);
        String reverse = sb.reverse().toString();
    
        return cleanString.equals(reverse);
    }    
}
