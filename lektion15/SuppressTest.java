public class SuppressTest {
    @SuppressWarnings("java:S4973")
    public static void main(String[] args) {
        Integer i = 1;
        Integer j = Integer.parseInt(args[0]);

        if (i == j) {
            System.out.println("Hurra!!");
        }
    }
}
