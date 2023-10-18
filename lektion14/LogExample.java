import java.io.*;
import java.nio.file.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExample {
    private static final Logger logger =
                    LoggerFactory.getLogger(LogExample.class);

    public static void main(String[] args) {
        int someData = 3;
        logger.debug("Detta är debuginfo");
        logger.info("Detta är bra information");
        logger.warn("Detta är en varning med data: {}", 
                    someData);

        Path input = Path.of("foo/nisse.txt");
        try (BufferedReader r = Files.newBufferedReader(input)) {
            String line = r.readLine();
            System.out.println(line);
        }
        catch (IOException ex) {
            logger.error("Could not read file", ex);
        }
    }

    // error, warn, info, debug, trace
}
