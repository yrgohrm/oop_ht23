import java.io.IOException;

public class Ex8 {
    private static void throwChecked() throws IOException {
        throw new IOException();
    }

    public static void useThingThatThrows() throws IOException, InterruptedException {
        throwChecked();
        Thread.sleep(1000);
    }

    public static void main(String[] args) {
        try {
            throwChecked();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
