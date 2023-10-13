public class Ex1Fac {
    // calculates the facutly 1*2*...*n
    public static int fac(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n is less than 0");
        }

        if (n == 0) {
            return 1;
        }
        else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fac(-1));
    }
}