public class SimpleThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(SimpleThread::doThreadStuff);

        t1.start();

        System.out.println("world");
        System.out.println("world");
        System.out.println("world");
        System.out.println("world");
    }


    private static void doThreadStuff() {
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
    }
}
