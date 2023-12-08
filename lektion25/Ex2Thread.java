public class Ex2Thread {
    private static class Interruptable implements Runnable {
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
            // while (true) {
                System.out.println("Jobbar...");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Interruptable());
        t1.start();

        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
     
        t1.interrupt(); // tells the thread that it should quit
        t1.join(); // waits for it to exit

        System.out.println("Exiting main thread...");
    }
}
