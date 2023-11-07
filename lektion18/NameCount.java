import java.io.*;
import java.nio.file.*;
import java.util.*;

public class NameCount {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("names.txt"));
        Map<String, Integer> uniqueNames = new TreeMap<>();
        for (String line : lines) {
            String[] names = line.split(" ");
            String firstName = names[0];

            // if (uniqueNames.containsKey(firstName)) {
            //     int oldCount = uniqueNames.get(firstName);
            //     uniqueNames.put(firstName, oldCount + 1);
            // }
            // else {
            //     uniqueNames.put(firstName, 1);
            // }

            int oldCount = uniqueNames.getOrDefault(firstName, 0);
            uniqueNames.put(firstName, oldCount + 1);
        }

        System.out.println(uniqueNames);

        System.out.println("Antal Bosse: " + uniqueNames.get("Bosse"));

        for (Map.Entry<String, Integer> entry : uniqueNames.entrySet()) {
            String name = entry.getKey();
            Integer count = entry.getValue();

            System.out.printf("%s: %d%n", name, count);
        }
    }
}
