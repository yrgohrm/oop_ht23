import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class SomeServer {
    public static void main(String[] args) throws IOException {
        ExecutorService es = Executors.newCachedThreadPool();

        try (ServerSocket server = new ServerSocket(5687)) {

            while (!Thread.currentThread().isInterrupted()) {

                final Socket socket = server.accept();
                es.submit(() -> handleClient(socket));

            }

        }
    }

    private static void handleClient(Socket socket) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("Hello");
            bw.flush();
            socket.close();
        }
        catch (IOException ex) {
            System.err.println("oops!");
        }
    }
}
