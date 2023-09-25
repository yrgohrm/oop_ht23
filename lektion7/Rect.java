public class Rect {
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n-1);
    }

    public static void main(String[] args) {
        int res = fact(5);
        double rand = 100 * Math.random();
        
        System.out.println(res);
        System.out.println(rand);
    }
}
