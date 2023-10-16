public class Exercise3 {
    public static int imBadYouKnowIt(int value) {
        Integer[] arr = {Integer.valueOf(0), null, Integer.valueOf(2)};
        int i = (int) (Math.random() * 5);
        return value / arr[i];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            test();
        }
    }

    private static void test() {
        try {
            imBadYouKnowIt(1323);
        }
        catch (NullPointerException
                | ArithmeticException
                | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Något blev null!");
        }
        catch (Exception ex) {
            System.out.println(ex.getClass().getName());
        }
    }
}
