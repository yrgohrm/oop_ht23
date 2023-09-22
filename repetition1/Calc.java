public class Calc {
    public static void main(String[] args) {
        int x = 11;
        int y = 345;

        int res = add(y, x);
        System.out.println(res);

        System.out.println(sub(x, y));
        System.out.println(sub(y, x));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int c, int d) {
        return c - d;
    }
}
