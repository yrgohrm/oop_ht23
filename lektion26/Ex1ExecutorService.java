import java.util.concurrent.*;

public class Ex1ExecutorService {
    public static void main(String[] args) {
        // ExecutorService service = Executors.newFixedThreadPool(4);
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; ++i) {
            service.submit(() -> {
                for (int j = 0; j < 5; ++j) {
                    sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        
        service.shutdown();
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
