import java.io.*;
import java.nio.file.*;
import java.util.*;

public class WriteFile {
    public static void main(String[] args) {
        
        try {
            String hello = "Hello, world!";
            Files.writeString(Path.of("hello.txt"), hello);
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try {
            List<String> hellos = List.of("Hello", ",", "world!");
            Files.write(Path.of("hellos.txt"), hellos);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
