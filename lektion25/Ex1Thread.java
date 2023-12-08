import java.util.concurrent.ThreadLocalRandom;

public class Ex1Thread {
    private static class PrintRunner implements Runnable {
        public void run() {
            int random = ThreadLocalRandom.current().nextInt(10);
            for (int i = 0; i < 200; ++i) {
                System.out.print(random + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintRunner pr1 = new PrintRunner();
        PrintRunner pr2 = new PrintRunner();

        Thread t1 = new Thread(pr1); // vilken kod vi skall köra
        Thread t2 = new Thread(pr2); // vilken kod vi skall köra
        Thread t3 = new Thread(() -> { 
            System.out.print("hej"); 
            System.out.print("hopp"); 
        });

        t1.start(); // och kör den! startar första tråden
        t2.start(); // och kör den! startar andra tråden
        t3.start();
    }
}
