import java.io.*;
import java.net.*;

public class SomeClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("127.0.0.1", 5687)) {

            var r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println(r.readLine());

        }
    }
}
