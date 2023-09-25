public class MathFunctions {
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }

        return b;
        // return a > b ? a : b;
    }

    public static double min(double a, double b) {
        if (a < b) {
            return a;
        }

        return b;
        // return a < b ? a : b;
    }

    public static double mean(double a, double b) {
        return (a + b) / 2;
    }

    public static int min(int a, int b) {
        System.out.println("min för int");
        if (a < b) {
            return a;
        }

        return b;
        // return a < b ? a : b;
    }

    
    public static double mean(int a, int b) {
        return (a + b) / 2.0;
    }
}
