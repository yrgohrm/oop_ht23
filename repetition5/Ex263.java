import java.io.*;
import java.nio.file.*;
import java.util.concurrent.*;

public class Ex263 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        for (String arg : args) {
            service.submit(() -> {
                int count = countA(Path.of(arg));
                System.out.println(arg + ": " + count);
                System.out.println(Thread.currentThread().getName());
            });
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.HOURS);
    }

    private static int countA(Path file) {
        // int count = 0;

        // try (BufferedReader r = Files.newBufferedReader(file)) {
        //     String line;
        //     while ((line = r.readLine()) != null) {
        //         count += countA(line);
        //     }
        // }
        // catch (IOException ex) {
        //     System.err.println(ex.getMessage());
        // }

        // return count;
        
        try {
            return countA(Files.readString(file));
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
            return -1;
        }
    }

    private static int countA(String line) {
        int count = 0;
        // for (int i = 0; i < line.length(); ++i) {
        //     if (line.charAt(i) == 'A') {
        //         count++;
        //     }
        // }

        for (char ch : line.toCharArray()) {
            if (ch == 'A') {
                count++;
            }
        }

        return count;
    }
}
