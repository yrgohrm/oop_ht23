import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PalindromeFinder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Du måste ange filer som argument!");
            System.exit(-1);
        }

        Collection<String> allPalindromes = new TreeSet<>();
        for (String fileName : args) {
            try {
                Collection<String> palindromes = Palindromes.readAllPalindromes(fileName);
                allPalindromes.addAll(palindromes);
            }
            catch (Exception ex) {
                System.err.println(
                        "An error occurred reading file " 
                        + fileName + ": " + ex.getMessage());
            }
        }

        try {
            writeOut(allPalindromes);
        }
        catch (Exception ex) {
            System.err.println("An error occurred writing output: "
                                + ex.getMessage());
        }
    }
    
    private static void writeOut(Collection<String> palindromes) {
        try {
            Files.write(Path.of("output.txt"), palindromes);
        }
        catch (IOException ex) {
            throw new UncheckedIOException(ex);
            // System.err.println("Could not write output: " + ex.getMessage());
        }
    }
}
